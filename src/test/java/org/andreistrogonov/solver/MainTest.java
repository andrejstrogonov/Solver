package org.andreistrogonov.solver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MainTest {

    public int f(int age, String gender) {

        if (age <= 25 && gender.equals("w")) {
            return 72;
        }

        if (age <= 25 && gender.equals("m")) {
            return 67;
        }

        if (age > 25 && age < 55 && gender.equals("w")) {
            return 67;
        }

        return 62;
    }

    public String f5(String start) {

        if (start.equals("yes")) {
            return "other";
        }

        return "no other";
    }

    @Test
    public void testAdd() {
//        assertTrue(Parser.weightCalculator(50,"normal", "male"));

        // Привило 5
        assertEquals("other", f5("yes"));
        assertNotEquals("other", f5("no"));

        // Правило 6
        assertEquals(72, f(25, "w"));
        assertEquals(72, f(20, "w"));

        assertNotEquals(72, f(20, "m"));
        assertNotEquals(72, f(50, "w"));

        // Правило 7
        assertEquals(67, f(25, "m"));
        assertEquals(67, f(20, "m"));

        assertNotEquals(67, f(50, "m"));
        assertNotEquals(67, f(20, "w"));

        // Правило 8
        assertEquals(67, f(26, "w"));
        assertEquals(67, f(54, "w"));

        assertNotEquals(67, f(25, "w"));
        assertNotEquals(67, f(30, "m"));
        assertNotEquals(67, f(56, "w"));
    }
}
