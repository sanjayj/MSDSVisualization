package msds.vs.assignment6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import processing.core.PApplet;
import processing.core.PConstants;
import processing.core.PGraphics;
import processing.core.PImage;
import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.AbstractMarker;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.providers.*;

import de.fhpotsdam.unfolding.utils.MapUtils;

public class LiveTraffic extends PApplet {

    UnfoldingMap map;
    PImage img;
    List<DataEntry> dataEntriesMap;
    List<Marker> countryMarkers;
    float r=0;

    public void settings() {
        size(800, 600, P2D);
        //size(2000, 1400, P2D);
    }

    public static void main(String args[]) {
        PApplet.main(new String[] { LiveTraffic.class.getName() });
    }
    Iterator<DataEntry> it;
    public void setup() {
        img = loadImage("images/hurricane.gif");
        map = new UnfoldingMap(this, new MapBox.WorldLightProvider());
        map.zoomToLevel(2);
        map.setBackgroundColor(240);
        MapUtils.createDefaultEventDispatcher(this, map);

        dataEntriesMap = loadPopulationFromCSV("data/storms.csv");
        List<DataEntry> demf = dataEntriesMap
                .stream()
                .filter(e -> e.name.contains("KATRINA"))
                .collect(Collectors.toList());

        it = demf.iterator();


    }

    public void draw() {
        background(240);
        if(frameCount % 1 == 0)
        {
            if(it.hasNext())
            {

                DataEntry dataEntry = it.next();
                Location location = new Location(dataEntry.lat, dataEntry.lng);
                ImageMarker marker = new ImageMarker(location, img,dataEntry.wind);
                fill(random(255),random(255),random(255));
                String sNum = dataEntry.serialNum.trim();
                marker.setColor(Integer.parseInt(sNum.substring(sNum.length()-9,5)));
                map.addMarker(marker);
            }
        }
        map.draw();




        // The image is drawn in object coordinates, i.e. the marker's origin (0,0) is at its geo-location.



        //pushMatrix();
		/*imageMode(PConstants.CENTER);
		 translate(300, 300);
			rotate(r);
			image(img,0,0);


		 r=r+0.1f;
		//System.out.println("x=" +x+"y="+y+":" + i);
		 //popMatrix();
		*/
    }

    public List<DataEntry> loadPopulationFromCSV(String fileName) {
        List<DataEntry> dataEntriesMap = new ArrayList<DataEntry>();
        String[] rows = loadStrings(fileName);
        int i = 0;
        DateFormat format = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss", Locale.ENGLISH);
        for (String row : rows) {
            i++;
            if (i < 4) {
                continue;
            }
            String[] columns = row.split(",");
            if (columns.length >= 15) {
                DataEntry dataEntry = new DataEntry();
                dataEntry.id = i;
                dataEntry.serialNum = columns[0];
                dataEntry.year = Integer.parseInt(columns[1].trim());
                dataEntry.name = columns[5].trim();
                try
                {
                    dataEntry.date = format.parse(columns[6].trim());
                }catch(ParseException p)
                {
                    println("Exception" + p.getMessage());
                }

                dataEntry.lat = Float.parseFloat(columns[8].trim());
                dataEntry.lng = Float.parseFloat(columns[9].trim());
                dataEntry.wind = Float.parseFloat(columns[13].trim());
                dataEntriesMap.add(dataEntry);
            }
        }

        return dataEntriesMap;
    }

    public class DataEntry {
        Integer id;
        String serialNum;
        Integer year;
        String name;
        Date date;
        Float lat;
        Float lng;
        Float wind;
    }

}
class ImageMarker extends AbstractMarker {

    PImage img;
    Float size;
    Float r=0f;
    public ImageMarker(Location location, PImage img,Float size) {
        super(location);
        this.img = img;
        this.size = size*0.015f;
    }

    @Override
    public void draw(PGraphics pg, float x, float y) {


        pg.pushStyle();
        pg.imageMode(PConstants.CENTER);


        // The image is drawn in object coordinates, i.e. the marker's origin (0,0) is at its geo-location.
        //if(pg.parent.frameCount % 120==0)
        //{
        pg.pushMatrix();
        pg.translate(x, y);
        pg.rotate(r);
        r=r+.1f;

        //System.out.println("x=" +x+"y="+y+":" + i);
        pg.image(img, 0, 0,10*size,10*size);

        pg.popMatrix();
        //}
        pg.popStyle();
    }

    @Override
    protected boolean isInside(float checkX, float checkY, float x, float y) {
        return checkX > x && checkX < x + img.width && checkY > y && checkY < y + img.height;
    }

}
