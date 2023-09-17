package org.andreistrogonov.solver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void testAdd() {
        assertTrue(Parser.weightCalculator(50,"normal", "male"));
    }
}
