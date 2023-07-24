import enums.DirectionEnum;
import models.Rover;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class RoverTest {

    private Rover curiosity;
    private Rover insight;
    private Rover opportunity;
    private Rover perseverance;
    private Rover spirit;

    @Before
    public void before(){
        curiosity = new Rover(1,1, DirectionEnum.NORTH);
        insight = new Rover(1,1, DirectionEnum.SOUTH);
        opportunity = new Rover(1,1, DirectionEnum.EAST);
        perseverance = new Rover(1,1, DirectionEnum.WEST);
        spirit = new Rover(-1, -1, null);
    }

    @Test
    public void canMoveNorth(){
        assertEquals(1, curiosity.getyPosition());
        assertEquals(1, curiosity.getxPosition());
        curiosity.move();
        assertEquals(2, curiosity.getyPosition());
        assertEquals(1, curiosity.getxPosition());
    }

    @Test
    public void canMoveSouth(){
        assertEquals(1, insight.getyPosition());
        assertEquals(1, insight.getxPosition());
        insight.move();
        assertEquals(0, insight.getyPosition());
        assertEquals(1, insight.getxPosition());
    }

    @Test
    public void canMoveEast(){
        assertEquals(1, opportunity.getyPosition());
        assertEquals(1, opportunity.getxPosition());
        opportunity.move();
        assertEquals(1, opportunity.getyPosition());
        assertEquals(2, opportunity.getxPosition());
    }

    @Test
    public void canMoveWest(){
        assertEquals(1, perseverance.getyPosition());
        assertEquals(1, perseverance.getxPosition());
        perseverance.move();
        assertEquals(1, perseverance.getyPosition());
        assertEquals(0, perseverance.getxPosition());
    }

    @Test
    public void canRotateLeft() {
        assertEquals(180, insight.getDirection().getAngle());
        insight.rotateLeft();
        assertEquals(90, insight.getDirection().getAngle());

        assertEquals(0, curiosity.getDirection().getAngle());
        curiosity.rotateLeft();
        assertEquals(270, curiosity.getDirection().getAngle());
    }

    @Test
    public void canRotateRight() {
        assertEquals(180, insight.getDirection().getAngle());
        insight.rotateRight();
        assertEquals(270, insight.getDirection().getAngle());

        assertEquals(270, perseverance.getDirection().getAngle());
        perseverance.rotateRight();
        assertEquals(0, perseverance.getDirection().getAngle());
    }

    @Test
    public void canProcessDirectionCommandString() {
        spirit.processDirectionCommand("N");
        assertEquals("N", spirit.getDirection().getCardinalDirection());
    }

    @Test
    public void canPlaceRover() {
        List<String> placeCommand = new ArrayList<>();
        placeCommand.add("1");
        placeCommand.add("1");
        placeCommand.add("N");
        spirit.placeAt(placeCommand);
        assertEquals(1, spirit.getxPosition());
        assertEquals(1, spirit.getyPosition());
        assertEquals("N", spirit.getDirection().getCardinalDirection());
    }

    @Test
    public void canFollowProcessMovementCommand(){
        List<String> movementCommand = new ArrayList<>();
        movementCommand.add("R");
        movementCommand.add("M");
        movementCommand.add("M");
        curiosity.processMovementCommand(movementCommand);
        assertEquals(3, curiosity.getxPosition());
        assertEquals(1, curiosity.getyPosition());
        assertEquals("E", curiosity.getDirection().getCardinalDirection());
    }

    @Test
    public void canFollowProcessCommand(){
        ArrayList<String> fullRoverCommand = new ArrayList<>();
        fullRoverCommand.add("1");
        fullRoverCommand.add("1");
        fullRoverCommand.add("N");
        fullRoverCommand.add("R");
        fullRoverCommand.add("M");
        fullRoverCommand.add("M");
        spirit.processCommand(fullRoverCommand);
        assertEquals(3,spirit.getxPosition());
        assertEquals(1,spirit.getyPosition());
        assertEquals("E", spirit.getDirection().getCardinalDirection());
    }

}
