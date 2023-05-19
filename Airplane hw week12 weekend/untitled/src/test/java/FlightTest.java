import crew.CabinCrewMember;
import crew.Pilot;
import crew.Rank;
import org.junit.Before;

import java.util.ArrayList;

public class FlightTest {

    Flight flight1;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane learjet;
    CabinCrewMember flightAttendant1;
    CabinCrewMember flightAttendant2;
    CabinCrewMember firstOfficer;
    Pilot pilot;

    @Before
    public void setUp(){
        passenger1 = new Passenger("Lewis", 1);
        passenger2 = new Passenger("Toby", 0);
        passenger3 = new Passenger("Aneeqa", 3);
        learjet = new Plane(PlaneType.LEARJET);
        flightAttendant1 = new CabinCrewMember("Geri", Rank.FLIGHT_ATTENDANT);
        pilot = new Pilot("Gui", Rank.PILOT, "NNN");
        ArrayList<Passenger> passengers = new ArrayList<>();
        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>(flightAttendant1, pilot);
        
    }

}
