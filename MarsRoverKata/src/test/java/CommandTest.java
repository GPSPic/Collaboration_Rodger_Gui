import models.Command;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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
        List<String> testPlateauSize = new ArrayList<>();
        testPlateauSize.add("5");
        testPlateauSize.add("5");
        assertEquals(testPlateauSize, commandGoal.getPlateauCommand());
        List<List<String>> testRoversCommandsList = new ArrayList<>();
        List<String> rover1TestCommand = new ArrayList<>();
        List<String> rover2TestCommand = new ArrayList<>();
        rover1TestCommand.add("1");
        rover1TestCommand.add("2");
        rover1TestCommand.add("N");
        rover1TestCommand.add("L");
        rover1TestCommand.add("M");
        rover1TestCommand.add("L");
        rover1TestCommand.add("M");
        rover1TestCommand.add("L");
        rover1TestCommand.add("M");
        rover1TestCommand.add("L");
        rover1TestCommand.add("M");
        rover1TestCommand.add("M");
//        [[1, 2, N, L, M, L, M, L, M, L, M, M], [3, 3, E, M, M, R, M, M, R, M, R, R, M]]
        rover2TestCommand.add("3");
        rover2TestCommand.add("3");
        rover2TestCommand.add("E");
        rover2TestCommand.add("M");
        rover2TestCommand.add("M");
        rover2TestCommand.add("R");
        rover2TestCommand.add("M");
        rover2TestCommand.add("M");
        rover2TestCommand.add("R");
        rover2TestCommand.add("M");
        rover2TestCommand.add("R");
        rover2TestCommand.add("R");
        rover2TestCommand.add("M");
        testRoversCommandsList.add(rover1TestCommand);
        testRoversCommandsList.add(rover2TestCommand);
        assertEquals(testRoversCommandsList, commandGoal.getRoverCommands());
    }

//    @Test
//    public void canFindDirection(){
//        assertTrue(command1.directionFinder("N"));
//        assertTrue(command1.directionFinder("E"));
//        assertTrue(command1.directionFinder("S"));
//        assertTrue(command1.directionFinder("W"));
//        assertFalse(command1.directionFinder("n"));
//        assertFalse(command1.directionFinder("F"));
//        assertFalse(command1.directionFinder("NE"));
//    }

}
