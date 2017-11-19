import static org.junit.Assert.*;

import org.junit.Test;

public class TestSolution {
    // http://www.java2s.com/Tutorials/Java/JUnit/0050__JUnit_Assert.htm
	
	@Test
	public void testFactorielle() {
		
    	Solution sol = new Solution();
        assertEquals(1, sol.factorielle1(0)); 
        assertEquals(1, sol.factorielle1(1)); 
        assertEquals(2, sol.factorielle1(2)); 
        assertEquals(6, sol.factorielle1(3)); 
        
        assertEquals(1, sol.factorielle2(0)); 
        assertEquals(1, sol.factorielle2(1)); 
        assertEquals(2, sol.factorielle2(2)); 
        assertEquals(6, sol.factorielle2(3)); 
	}

	@Test
	public void testAddition() {
		
    	Solution sol = new Solution();
        assertEquals(0, sol.addition(0, 0)); 
        assertEquals(100, sol.addition(4, 96)); 
        assertEquals(25, sol.multi(5, 5)); 

	}
	
}
