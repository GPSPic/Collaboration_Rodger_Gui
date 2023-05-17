import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before (){
        manager = new Manager("Bob", "0", 20000, "HR");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(50);
        assertEquals(30000, manager.getSalary(), 0);
    }

    @Test
    public void canPayBonus(){
        double bonus = manager.payBonus();
        assertEquals(200, bonus, 0);
    }

    @Test
    public void cannotReduceSalary() {
        manager.raiseSalary(-50);
        assertEquals(20000, manager.getSalary(), 0);
    }

    @Test
    public void testChangeName(){
        manager.changeName("James");
        assertEquals("James", manager.getName());
    }

    @Test
    public void testCannotSetNameNull() {
        manager.changeName(null);
        assertEquals("Bob", manager.getName());
    }
}
