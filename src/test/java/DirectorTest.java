import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    private Director director;
    @Before
    public void setUp(){
        director = new Director("Sky", "SKY010101", 4000.00, 50000.00);
    }
    @Test
    public void hasBudget(){
        assertEquals(50000.00, director.getBudget(), 0.01);
    }
    @Test
    public void hasMoreBonus(){

        assertEquals(80.00,director.payBonus(), 0.00);
    }
}
