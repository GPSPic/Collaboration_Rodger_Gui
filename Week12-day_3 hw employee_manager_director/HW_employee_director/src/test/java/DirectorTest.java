import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Test
    public void hasBudget(){
        director = new Director("Bob", "0", 30000, "Gigolo", 25);
        assertEquals(25, director.getBudget(), 0);
    }

    @Test
    public void canPayBonus() {
        director = new Director("Bob", "0", 30000, "Gigolo", 25);
        double bonus = director.payBonus();
        assertEquals(600, bonus, 0);
    }
}
