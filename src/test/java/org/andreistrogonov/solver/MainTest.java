package org.andreistrogonov.solver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MainTest {

    @Test
    public void testAdd() {
        assertTrue(Parser.weightCalculator(50,"normal", "male"));

        // тесты 2-7, тк несколько дней назад указала, что делаю именно их
        // 2
        assertTrue(Parser.weightCalcUnderweight(48,"underweight", "male"));
        // 3
        assertEquals("low", Parser.coronaryRiskCalcBelow("below the average"));
        // 4
        assertEquals("low", Parser.coronaryRiskCalcAverage("below the average"));
        // 5
        assertEquals("low", Parser.checkStart("yes"));
        // 6
        assertEquals(72, Parser.lifetimeCalcFemale(24, "female"));
        // 7
        assertEquals(72, Parser.lifetimeCalcMale(24, "male"));

    }
}
