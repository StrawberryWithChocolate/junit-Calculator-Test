package junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {   
    private static MyTest calculator = new MyTest();

    @Before
    public void setUp() throws Exception {
        calculator.clear();
    }

    @Test
    public void testAdd() {
        calculator.add(3,4);
        assertEquals(7, calculator.getresult());

    }

    @Test
    public void testSubstract() {
        calculator.substract(8,3);
        assertEquals(5, calculator.getresult());

    }

    @Ignore("Multiply() Not yet implemented")
    @Test
    public void testMultiply() {
        fail("Not yet implemented");
    }

    @Test
    public void testDivide() {
        //calculator.add(8);
        calculator.divide(8,2);
        assertEquals(4, calculator.getresult());

    }

}
