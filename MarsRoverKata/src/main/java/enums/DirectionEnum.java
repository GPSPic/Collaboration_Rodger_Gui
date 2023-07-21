package enums;

public enum DirectionEnum {
    NORTH("N", 0),
    EAST("E", 90),
    SOUTH("S", 180),
    WEST("W", 270);

    private final String cardinalDirection;
    private final int angle;

    DirectionEnum(String cardinalDirection, int angle) {
        this.cardinalDirection = cardinalDirection;
        this.angle = angle;
    }

    public String getCardinalDirection() {
        return cardinalDirection;
    }

    public int getAngle() {
        return angle;
    }
}
