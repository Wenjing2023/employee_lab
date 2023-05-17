import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    private Manager manager;

    @Before
    public void setUp(){
        manager = new Manager("Mar", "EC90123", 3000.00,"Teaching Team");
    }
    @Test
    public void canGetDeptName(){
        assertEquals("Teaching Team", manager.getDeptName());
    }
    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(500.00);
        assertEquals(3500.00, manager.getSalary(), 0.00 );
    }
    @Test
    public void canPayBonus(){
        manager.payBonus();
        assertEquals(30.00,manager.payBonus(), 0.00);
    }



}
