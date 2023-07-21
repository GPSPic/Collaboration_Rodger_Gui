package enums;

public enum LeftRightEnum {
    LEFT("L", -90),
    RIGHT("R", 90);

    private final String direction;
    private final int addedAngle;

    LeftRightEnum(String direction, int addedAngle) {
        this.direction = direction;
        this.addedAngle = addedAngle;
    }

    public String getDirection() {
        return direction;
    }

    public int getAddedAngle() {
        return addedAngle;
    }
}
