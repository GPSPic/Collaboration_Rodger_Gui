package models;

import enums.DirectionEnum;
import enums.LeftRightEnum;

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

    public void rotateLeft (String rotateLCommand) {
        


        DirectionEnum newDirection;



        this.setDirection(newDirection);
    }

//    public void rotateLeft (String rotateDirectionCommand) {
//        int currentDirectionAngle = this.getDirection().getAngle();
//
//        if (rotateDirectionCommand.equals("L")) {
////            LeftRightEnum rotateLeft = LeftRightEnum.LEFT;
//            int rotationAngle = LeftRightEnum.LEFT.getAddedAngle();
//        } else if (rotateDirectionCommand.equals("R")) {
////            LeftRightEnum rotateRight = LeftRightEnum.RIGHT;
//        } else {
//            System.out.println("Error, there is no rotation possible to" + rotateDirectionCommand);
//        }



//        int rotationAngle = rotateDirection
//        DirectionEnum newDirection;
//
//        switch (currentAngle) {
//
//        }

//        this.setDirection(DirectionEnum newDirection);
//    }
}
