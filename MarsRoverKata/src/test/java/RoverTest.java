import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RoverTest {

    private Rover curiosity;
    private Rover insight;

    @Before
    public void before(){
        curiosity = new Rover(1,1, "N");
        insight = new Rover(1,1, "S");
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
        System.out.println(insight.getyPosition());
        curiosity.move();
        assertEquals(0, insight.getyPosition());
        assertEquals(1, insight.getxPosition());
    }


}
