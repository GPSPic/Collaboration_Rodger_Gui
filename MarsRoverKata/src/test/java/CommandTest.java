import models.Command;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CommandTest {

    private Command command1;
    private Command commandGoal;

    @Before
    public void before(){
        command1 = new Command("5 5\n" +
                "\n" +
                "1 2 N\n" +
                "\n" +
                "RM");
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

    }

    @Test
    public void canSortCommand() {
        commandGoal.sortCommand();
//        assertEquals(3, command1.getSortedCommands().size());
        System.out.println("plateauCommand: " + commandGoal.getPlateauCommand());
        System.out.println("current rovers command: " + commandGoal.getRoverCommands());
    }

    @Test
    public void canFindDirection(){
        assertTrue(command1.directionFinder("N"));
        assertTrue(command1.directionFinder("E"));
        assertTrue(command1.directionFinder("S"));
        assertTrue(command1.directionFinder("W"));
        assertFalse(command1.directionFinder("n"));
        assertFalse(command1.directionFinder("F"));
        assertFalse(command1.directionFinder("NE"));
    }

}
