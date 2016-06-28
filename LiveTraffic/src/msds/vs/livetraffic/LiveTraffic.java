package msds.vs.livetraffic;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import msds.vs.livetraffic.data.TrafficData;
import msds.vs.livetraffic.models.Aircraft;
import peasy.PeasyCam;
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
    List<Aircraft> aircrafts;
    float r=0;
    Iterator<Aircraft> it;

    public void settings() {
        size(800, 600, P3D);
    }

    public static void main(String args[]) {
        PApplet.main(new String[] { LiveTraffic.class.getName() });
    }

    public void setup() {
        img = loadImage("hurricane.gif");
        map = new UnfoldingMap(this, new MapBox.WorldLightProvider());
        map.zoomToLevel(2);
        map.setBackgroundColor(240);
        MapUtils.createDefaultEventDispatcher(this, map);

       aircrafts = new TrafficData().getFlightsDeparting("KDFW");

        it = aircrafts.iterator();

        PeasyCam cam = new PeasyCam(this,50);
        cam.setMinimumDistance(50);
        cam.setMaximumDistance(500);


    }

    public void draw() {
        background(240);
        if(frameCount % 1 == 0)
        {
            if(it.hasNext())
            {

                Aircraft aircraft = it.next();
                if(aircraft.getTrackPoints().size() > 0) {
                    Location location = new Location(aircraft.getTrackPoints().get(0).getLatitude(), aircraft.getTrackPoints().get(0).getLongitude());
                    ImageMarker marker = new ImageMarker(location, img, (float) aircraft.getTrackPoints().get(0).getAltitude());
                    fill(random(255), random(255), random(255));
                    //String sNum = dataEntry.serialNum.trim();
                    //marker.setColor(Integer.parseInt(sNum.substring(sNum.length()-9,5)));
                    map.addMarker(marker);
                }
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
