package msds.vs.livetraffic.models;

/**
 * Created by p00012387 on 6/28/16.
 */
public class FlightTrackPoint {
    int timestamp;
    String updateType;
    String altitudeChange;
    float   latitude;
    float   longitude;
    int     altitude;

    public float getLatitude() {
        return latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public String getAltitudeChange() {
        return altitudeChange;
    }

    public String getUpdateType() {
        return updateType;
    }

    public void setUpdateType(String updateType) {
        this.updateType = updateType;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setAltitudeChange(String altitudeChange) {
        this.altitudeChange = altitudeChange;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }
}
