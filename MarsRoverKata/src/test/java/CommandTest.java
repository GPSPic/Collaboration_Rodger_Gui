import models.Command;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CommandTest {

    private Command command1;

    @Before
    public void before(){
        command1 = new Command("5 5\n" +
                "\n" +
                "1 2 N\n" +
                "\n" +
                "RM");
    }

    @Test
    public void canSortCommand() {
        command1.sortCommand();
        assertEquals(3, command1.getSortedCommands().size());
    }

//    @Test
//    public void canProcessCommand(){
//
//    }

}
