package _02_RecursionMath;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionMathTest {
    
    @Test
    public void testMultiplication() {
        assertEquals(12, RecursionMath.recursiveMultiplication(3, 4));
        assertEquals(10, RecursionMath.recursiveMultiplication(5, 2));
        assertEquals(4, RecursionMath.recursiveMultiplication(2, 2));
        assertEquals(1, RecursionMath.recursiveMultiplication(1, 1));
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
    	  //assertEquals(40, RecursionMath.recursiveMultiplication(400, 10));
    	  //assertEquals(3, RecursionMath.recursiveMultiplication(3, 1));
    	 assertEquals(1, RecursionMath.recursiveDivision(9, 9));
         assertEquals(2, RecursionMath.recursiveDivision(10, 5));
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
    	 assertEquals(2, RecursionMath.recursiveDivision(2, 1));
    }
}
