import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    private Employee employee;
    @Before
    public void setUp(){
        employee = new Employee("Wenjing", "EC90123", 3000.00) {

        };
    }
    @Test
    public void canChangeName(){
        employee.setName("Tanpopo");
        assertEquals("Tanpopo",employee.getName() );
    }
}
