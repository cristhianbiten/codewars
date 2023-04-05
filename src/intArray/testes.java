package intArray;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class testes {
	
    @Test
    public void testSomething() {
        assertEquals(15, sumOfPositive.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, sumOfPositive.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, sumOfPositive.sum(new int[]{}));
        assertEquals(0, sumOfPositive.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, sumOfPositive.sum(new int[]{-1,2,3,4,-5}));
    }
}
