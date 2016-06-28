package msds.vs.livetraffic.models;

import java.util.ArrayList;

public class Aircraft {

    String ident;
    String aircraftType;
    String origin;
    String destination;
    long estimatedarrivaltime;

    ArrayList<FlightTrackPoint> trackPoints;

    public ArrayList<FlightTrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public long getEstimatedarrivaltime() {
        return estimatedarrivaltime;
    }

    public String getAircraftType() {
        return aircraftType;
    }

    public String getDestination() {
        return destination;
    }

    public String getIdent() {
        return ident;
    }

    public String getOrigin() {
        return origin;
    }

    public void setAircraftType(String aircraftType) {
        this.aircraftType = aircraftType;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setEstimatedarrivaltime(long estimatedarrivaltime) {
        this.estimatedarrivaltime = estimatedarrivaltime;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setTrackPoints(ArrayList<FlightTrackPoint> trackPoints) {
        this.trackPoints = trackPoints;
    }
}
