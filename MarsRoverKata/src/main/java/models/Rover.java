package models;

import enums.DirectionEnum;
import enums.LeftRightEnum;

import java.util.ArrayList;

public class Rover {

    private int xPosition;
    private int yPosition;
    private DirectionEnum direction;

    public Rover(int xPosition, int yPosition, DirectionEnum direction) {
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

    public DirectionEnum getDirection() {
        return direction;
    }

    public void setDirection(DirectionEnum direction) {
        this.direction = direction;
    }

    public void move() {
        String currentDirection = this.getDirection().getCardinalDirection();
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

    public void rotateLeft () {
        int currentDirectionAngle = this.getDirection().getAngle();
        int newDirectionAngle = currentDirectionAngle - 90;        
        DirectionEnum newDirection = null;
        switch (newDirectionAngle){
            case 0:
                newDirection = DirectionEnum.NORTH;
                break;
            case 90:
                newDirection = DirectionEnum.EAST;
                break;
            case 180:
                newDirection = DirectionEnum.SOUTH;
                break;
            case -90:
                newDirection = DirectionEnum.WEST;
                break;
        }
    this.setDirection(newDirection);
    }

    public void rotateRight () {
        int currentDirectionAngle = this.getDirection().getAngle();
        int newDirectionAngle = currentDirectionAngle + 90;
        DirectionEnum newDirection = null;
        switch (newDirectionAngle){
            case 360:
                newDirection = DirectionEnum.NORTH;
                break;
            case 90:
                newDirection = DirectionEnum.EAST;
                break;
            case 180:
                newDirection = DirectionEnum.SOUTH;
                break;
            case 270:
                newDirection = DirectionEnum.WEST;
                break;
        }
        this.setDirection(newDirection);
    }

    public void processDirectionCommand (String directionCommandAsString) {
        DirectionEnum directionCommandAsEnum = null;

        switch (directionCommandAsString) {
            case "N":
                directionCommandAsEnum = DirectionEnum.NORTH;
                break;
            case "E":
                directionCommandAsEnum = DirectionEnum.EAST;
                break;
            case "S":
                directionCommandAsEnum = DirectionEnum.SOUTH;
                break;
            case "W":
                directionCommandAsEnum = DirectionEnum.WEST;
                break;
        }
        this.setDirection(directionCommandAsEnum);
    }

    public void placeAt (ArrayList<String> placementCommand) {
        int xPositionCommand = Integer.parseInt(placementCommand.get(0));
        this.setxPosition(xPositionCommand);
        int yPositionCommand = Integer.parseInt(placementCommand.get(1));
        this.setyPosition(yPositionCommand);
        this.processDirectionCommand(placementCommand.get(2));
    }
}