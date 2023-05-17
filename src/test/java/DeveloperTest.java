import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    private Developer developer;
    @Before
    public void setUp(){
        developer = new Developer("Jasper","HE10000", 5000.00);
    }
    @Test
    public void hasName(){
        assertEquals("Jasper", developer.getName());
    }

    @Test
    public void hasNINumber(){
        assertEquals("HE10000", developer.getNINumber());
    }

    @Test
    public void hasSalary(){
        assertEquals(5000.00,developer.getSalary(), 0.01);
    }

}
