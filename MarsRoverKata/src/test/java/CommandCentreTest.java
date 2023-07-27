import enums.DirectionEnum;
import models.Command;
import models.CommandCentre;
import models.Plateau;
import models.Rover;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CommandCentreTest {

    private Command commandGoal;
    private Rover curiosity;
    private Rover insight;
    private Rover opportunity;
    private Rover perseverance;
    private Rover spirit;
    private Plateau plateau;
    private CommandCentre commandCentre;

    @Before
    public void before(){

        commandGoal = new Command(
                "5 5\n" +
                        "\n" +
                        "1 2 N\n" +
                        "\n" +
                        "LMLMLMLMM\n" +
                        "\n" +
                        "3 3 E\n" +
                        "\n" +
                        "MMRMMRMRRM\n");

        curiosity = new Rover(1,1, DirectionEnum.NORTH);
        insight = new Rover(1,1, DirectionEnum.SOUTH);
        opportunity = new Rover(1,1, DirectionEnum.EAST);
        perseverance = new Rover(-1,-1, null);
        spirit = new Rover(-1, -1, null);
        plateau = new Plateau(-1,-1);

        commandCentre = new CommandCentre("CapeCarnival", plateau, commandGoal);
        commandCentre.addRover(spirit);
        commandCentre.addRover(perseverance);
    }

    @Test
    public void canSetPlateauSize(){
        commandCentre.setPlateauSize();
        assertEquals(5, commandCentre.getPlateau().getxLength());
        assertEquals(5, commandCentre.getPlateau().getyLength());
    }

    @Test
    public void canCommandRovers(){
        commandCentre.commandRovers();
        assertEquals(1, spirit.getxPosition());
        assertEquals(3, spirit.getyPosition());
        assertEquals("N", spirit.getDirection().getCardinalDirection());

        assertEquals(5, perseverance.getxPosition());
        assertEquals(1, perseverance.getyPosition());
        assertEquals("E", perseverance.getDirection().getCardinalDirection());
    }
}
