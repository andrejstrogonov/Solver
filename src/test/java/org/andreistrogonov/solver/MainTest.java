package org.andreistrogonov.solver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testAdd() {
        assertEquals("normal",Parser.weightCalculator(55,"small",false));

    }
}
