import crew.CabinCrewMember;
import crew.Pilot;

import java.util.ArrayList;
import java.util.Calendar;

public class Flight {

    private Pilot pilot;
    private ArrayList<CabinCrewMember> crew;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departAirport;
    private Calendar departureTime;

    public Flight(Pilot pilot,
                  Plane plane,
                  String flightNumber,
                  String destination,
                  String departAirport,
                  Calendar departureTime){

        this.pilot =  pilot;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departAirport = departAirport;
        this.departureTime = departureTime;
        this.crew = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartAirport() {
        return departAirport;
    }

    public void setDepartAirport(String departAirport) {
        this.departAirport = departAirport;
    }

    public Calendar getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Calendar departureTime) {
        this.departureTime = departureTime;
    }

    public ArrayList<CabinCrewMember> getCrew() {
        return crew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getPassengersCount() {
        return this.passengers.size();
    }

    public int getAvailableSeats() {
        int flightCapacity = this.getPlane().getType().getCapacity();
        int availableSeats = flightCapacity - this.getPassengersCount();
        return availableSeats;
    }

    public void bookPassenger(Passenger passenger) {
        if (this.getAvailableSeats() > 0 && !this.passengers.contains(passenger)) {
            this.passengers.add(passenger);
        }
    }
}
