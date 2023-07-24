import models.Command;
import org.junit.Before;
import org.junit.Test;

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
    public void canProcessCommand(){

    }

}
