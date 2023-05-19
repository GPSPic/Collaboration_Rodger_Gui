public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight){
        this.flight = flight;
    }

    public double CalculateBaggageAllowancePerPassenger(){
        double capacity = flight.getPlane().getType().getCapacity();
        double weight = flight.getPlane().getType().getWeight();
        return (weight / 2) / capacity;
    }


}
