package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import lucky.math.Calculator;

/**
 * @author lakhdeeps
 *
 */
public class CalculatorTest {

	Calculator<Integer> tester = new Calculator<Integer>();
		
	@Test
    public void testSum() {
        assertEquals(new Integer(30), (Integer) tester.calculate(10, 20, Calculator.addition));
    }
	
	@Test
    public void testMultiply() {
        assertEquals(new Integer(200), (Integer) tester.calculate(10, 20, Calculator.multiply));
    }
	
	@Test
    public void testSub() {
        assertEquals(new Integer(-10), (Integer) tester.calculate(10, 20, Calculator.subtraction));
    }
	
	@Test
    public void testDiv() {
        assertEquals(new Integer(2), (Integer) tester.calculate(20,10, Calculator.divide));
    }
}
