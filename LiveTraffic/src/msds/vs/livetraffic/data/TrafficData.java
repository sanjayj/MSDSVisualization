package msds.vs.livetraffic.data;
import msds.vs.livetraffic.models.*;
import msds.vs.livetraffic.wsclient.*;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.*;


public class TrafficData {

    FlightXML2 locator;
    FlightXML2Soap webService;

    public TrafficData()
    {
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("sanjay659", "cb51d679467abb74c9182c40a2e9c35a6bb21b4a".toCharArray());
            }
        });
        locator = new FlightXML2();
        webService = locator.getFlightXML2Soap();
    }
    ArrayList<Airport> getAllAirports() {
        return null;
    }

    public List<Aircraft> getFlightsDeparting(String airport) {


        List<DepartureFlightStruct> departureFlightStructList = getDepartures(airport);
        List<Aircraft> aircraftList = new ArrayList<Aircraft>();

        for(DepartureFlightStruct departureFlightStruct : departureFlightStructList){
            Aircraft aircraft = new Aircraft();
            aircraft.setIdent(departureFlightStruct.getIdent());
            aircraft.setAircraftType(departureFlightStruct.getAircrafttype());
            aircraft.setDestination(departureFlightStruct.getDestination());
            aircraft.setOrigin(departureFlightStruct.getOrigin());
            aircraft.setEstimatedarrivaltime(departureFlightStruct.getEstimatedarrivaltime());

            InFlightAircraftStruct inFlightAircraftStruct= getInFlightInfo(departureFlightStruct.getIdent());
            if(inFlightAircraftStruct != null && inFlightAircraftStruct.getFaFlightID().length() > 0) {
                List<TrackStruct> trackStructList = getHistoricalTrack(inFlightAircraftStruct.getFaFlightID());

                ArrayList<FlightTrackPoint> flightTrackPoints = new ArrayList<FlightTrackPoint>();
                if(trackStructList != null && trackStructList.size() > 0) {
                    for (TrackStruct trackStruct : trackStructList) {
                        FlightTrackPoint flightTrackPoint = new FlightTrackPoint();
                        flightTrackPoint.setAltitude(trackStruct.getAltitude());
                        flightTrackPoint.setAltitudeChange(trackStruct.getAltitudeChange());
                        flightTrackPoint.setLongitude(trackStruct.getLongitude());
                        flightTrackPoint.setLatitude(trackStruct.getLatitude());
                        flightTrackPoint.setTimestamp(trackStruct.getTimestamp());
                        flightTrackPoint.setUpdateType(trackStruct.getUpdateType());

                        flightTrackPoints.add(flightTrackPoint);

                    }
                }
                aircraft.setTrackPoints(flightTrackPoints);
            }
            aircraftList.add(aircraft);
        }

        return aircraftList;
    }

    private List<DepartureFlightStruct> getDepartures(String airport) {
        try {
            DepartedRequest departedRequest = new DepartedRequest();
            departedRequest.setAirport(airport);
            departedRequest.setHowMany(15);
            departedRequest.setOffset(0);
            DepartureStruct results = webService.departed(departedRequest).getDepartedResult();
            return results.getDepartures();
        }catch(IllegalArgumentException ex) {
            return null;
        }


    }

    private InFlightAircraftStruct getInFlightInfo(String ident) {
        InFlightInfoRequest inFlightInfoRequest = new InFlightInfoRequest();
        inFlightInfoRequest.setIdent(ident);
        InFlightAircraftStruct result = webService.inFlightInfo(inFlightInfoRequest).getInFlightInfoResult();
        return result;
    }

    private  List<TrackStruct> getHistoricalTrack(String faFlightID) {
       try{
        GetHistoricalTrackRequest getHistoricalTrackRequest = new GetHistoricalTrackRequest();
        getHistoricalTrackRequest.setFaFlightID(faFlightID);
        ArrayOfTrackStruct result = webService.getHistoricalTrack(getHistoricalTrackRequest).getGetHistoricalTrackResult();

        return result.getData();
    }catch(IllegalArgumentException ex) {
        return null;
    }
    }

}

