package org.andreistrogonov.solver;

import org.junit.jupiter.api.Test;

import org.andreistrogonov.solver.Parser;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MainTest {

    @Test
    public void testAdd() {
//        assertTrue(Parser.weightCalculator(50,"normal", "male"));

        // Rule 8
        assertEquals(67, Parser.basicLifeExpectancy(25, "ж"));
        assertEquals(67, Parser.basicLifeExpectancy(54, "ж"));

        assertNotEquals(67, Parser.basicLifeExpectancy(23, "ж"));
        assertNotEquals(67, Parser.basicLifeExpectancy(20, "м"));
        assertNotEquals(67, Parser.basicLifeExpectancy(25, "м"));

        // Rule 13
        assertEquals("излишний", Parser.relativeWeight(85, "мелкое", "ж"));
        assertEquals("излишний", Parser.relativeWeight(86, "мелкое", "ж"));

        assertNotEquals("излишний", Parser.relativeWeight(45, "мелкое", "ж"));
        assertNotEquals("излишний", Parser.relativeWeight(85, "крупное", "ж"));
        assertNotEquals("излишний", Parser.relativeWeight(85, "мелкое", "м"));
        assertNotEquals("излишний", Parser.relativeWeight(45, "крупное", "ж"));
        assertNotEquals("излишний", Parser.relativeWeight(87, "крупное", "м"));
        assertNotEquals("излишний", Parser.relativeWeight(45, "мелкое", "м"));
        assertNotEquals("излишний", Parser.relativeWeight(45, "крупное", "м"));

        // Rule 14
        assertEquals("излишний", Parser.relativeWeight(55, "мелкое", "ж"));
        assertEquals("излишний", Parser.relativeWeight(84, "мелкое", "ж"));
        assertEquals("излишний", Parser.relativeWeight(65, "мелкое", "ж"));

        assertNotEquals("излишний", Parser.relativeWeight(45, "мелкое", "ж"));
        assertNotEquals("излишний", Parser.relativeWeight(82, "крупное", "ж"));
        assertNotEquals("излишний", Parser.relativeWeight(82, "мелкое", "м"));
        assertNotEquals("излишний", Parser.relativeWeight(45, "крупное", "ж"));
        assertNotEquals("излишний", Parser.relativeWeight(82, "крупное", "м"));
        assertNotEquals("излишний", Parser.relativeWeight(45, "мелкое", "м"));
        assertNotEquals("излишний", Parser.relativeWeight(45, "крупное", "м"));

        // Rule 15
        assertEquals("недостаточный", Parser.relativeWeight(55, "крупное", "-"));
        assertEquals("недостаточный", Parser.relativeWeight(45, "крупное", "-"));
        assertEquals("недостаточный", Parser.relativeWeight(45, "крупное", "м"));
        assertEquals("недостаточный", Parser.relativeWeight(55, "крупное", "ж"));

        assertNotEquals("недостаточный", Parser.relativeWeight(45, "мелкое", "-"));
        assertNotEquals("недостаточный", Parser.relativeWeight(55, "мелкое", "-"));
        assertNotEquals("недостаточный", Parser.relativeWeight(56, "крупное", "-"));
        assertNotEquals("недостаточный", Parser.relativeWeight(45, "мелкое", "м"));
        assertNotEquals("недостаточный", Parser.relativeWeight(55, "мелкое", "ж"));
        assertNotEquals("недостаточный", Parser.relativeWeight(56, "крупное", "м"));
        assertNotEquals("недостаточный", Parser.relativeWeight(56, "крупное", "ж"));

    }

}
