import crew.CabinCrewMember;
import crew.Pilot;
import crew.Rank;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

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
//        ArrayList<Passenger> passengers = new ArrayList<>();
//        ArrayList<CabinCrewMember> cabinCrewMembers = new ArrayList<>();
//        cabinCrewMembers.add(flightAttendant1);
//        cabinCrewMembers.add(pilot);
        flight1 = new Flight(pilot,
                learjet,
                "FR42",
                "EDI",
                "CDG",
                "12:00");
    }

    @Test
    public void canGetPassengerCount() {
        assertEquals(0, flight1.getPassengersCount());
    }

    @Test
    public void canGetAvailableSeats() {
        assertEquals(2, flight1.getAvailableSeats());
    }

    @Test
    public void canBookPassenger() {
        flight1.bookPassenger(passenger1);
        assertEquals(1, flight1.getPassengersCount());
    }

    @Test
    public void cannotBookPassenger() {
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger1);
        flight1.bookPassenger(passenger1);
    }
}
