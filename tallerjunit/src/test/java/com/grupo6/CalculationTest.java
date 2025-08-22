package com.grupo6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculationTest {
    @Test
    void testFindMax(){
        assertEquals(4,Calculation.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,Calculation.findMax(new int[]{-12,-1,-3,-4,-2}));
        assertEquals(8,Calculation.findMax(new int[]{-12,4,-3,8,0}));
    }
}
