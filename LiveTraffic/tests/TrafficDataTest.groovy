import msds.vs.livetraffic.data.TrafficData
import msds.vs.livetraffic.models.Aircraft;

/**
 * Created by p00012387 on 6/27/16.
 */
class TrafficDataTest extends groovy.util.GroovyTestCase {

    void testGetFlightsDeparting() {

        List<Aircraft> aircrafts =  new TrafficData().getFlightsDeparting("KDFW");
        if(aircrafts.size() > 0)
            assertTrue(true);

    }
}
