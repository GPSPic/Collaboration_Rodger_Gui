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


    public int CalculateTotalBaggageWeight() {
        int totalBags = 0;
        for (Passenger passenger : this.flight.getPassengers()) {
            totalBags += passenger.getNumBags();
        }
        return totalBags * 10;
    }

    public int FindRemainingBaggageAllowance() {
        int baggageWeightAllowance = this.flight.getPlane().getType().getWeight() / 2;
        return baggageWeightAllowance - this.CalculateTotalBaggageWeight();
    }


}
