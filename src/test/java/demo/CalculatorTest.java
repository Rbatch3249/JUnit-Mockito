package demo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    @Before
    public void setUp(){
        Calculator calc = new Calculator();
    }

    @Test
    public void testAddPositiveNumbers(){
        Calculator calc = new Calculator();
        int a= 10;
        int b = 20;

        int result = calc.add(a,b);

        assertEquals(30,result);
    }
    @Test
    public void testAddZero(){
        Calculator calc = new Calculator();
        int a= 10;
        int b = 0;

        int result = calc.add(a,b);

        assertEquals(10,result);
    }
}
