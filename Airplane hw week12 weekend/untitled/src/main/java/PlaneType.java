public enum PlaneType {
    BOEING747(3, 1000),
    LEARJET(2, 250),
    DREAMLINER(500, 2000);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getWeight() {
        return this.weight;
    }
}
