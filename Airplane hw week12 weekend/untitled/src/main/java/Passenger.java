public class Passenger {

    private String name;
    private int numBags;

    public Passenger(String name, int numBags) {
        this.name = name;
        this.numBags = numBags;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumBags() {
        return this.numBags;
    }

}
