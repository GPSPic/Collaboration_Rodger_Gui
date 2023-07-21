public class Rover {

    private int xPosition;
    private int yPosition;
    private String direction;

    public Rover(int xPosition, int yPosition, String direction) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.direction = direction;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public void move() {
        String currentDirection = this.getDirection();
        if (currentDirection == null) {
            return;
        }
        switch (currentDirection) {
            case "N":
                this.setyPosition(this.getyPosition() + 1);
                break;
            case "S":
                this.setyPosition(this.getyPosition() - 1);
                break;
            case "E":
                this.setxPosition(this.getxPosition() + 1);
                break;
            case "W":
                this.setxPosition(this.getxPosition() - 1);
                break;
        }
    }


}
