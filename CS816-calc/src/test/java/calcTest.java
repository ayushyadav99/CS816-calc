import org.junit.*;

import static org.junit.Assert.*;

public class calcTest {

    private calc calculator;

    @Before
    public void setUp(){
        calculator = new calc();
    }

    @Test
    public void truePositiveSqrt(){
        System.out.println("Checking square root of 9");
        assertEquals(calculator.sqrt(9), 3, 0.2f);
    }


}
