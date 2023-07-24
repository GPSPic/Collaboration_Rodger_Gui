import enums.DirectionEnum;
import models.Plateau;
import models.Rover;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlateauTest {

    private Rover curiosity;
    private Rover insight;
    private Rover opportunity;
    private Rover perseverance;
    private Rover spirit;

    private Plateau plateau;

    @Before
    public void before(){
        curiosity = new Rover(1,1, DirectionEnum.NORTH);
        insight = new Rover(1,1, DirectionEnum.SOUTH);
        opportunity = new Rover(1,1, DirectionEnum.EAST);
        perseverance = new Rover(1,1, DirectionEnum.WEST);
        spirit = new Rover(-1, -1, null);
        plateau = new Plateau(5,5);
        plateau.addRover(curiosity);
    }

    @Test
    public void canAddRover(){
        plateau.addRover(spirit);
        assertEquals(2, plateau.getRovers().size());
    }

//    @Test
//    public void canReceiveCommand(){
//
//        plateau.receiveCommand();
//    }

}
