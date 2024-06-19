package main.java.com.andreistrogonov.lpstructure;

import main.java.com.andreistrogonov.basicstructures.LPStructure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class LPStructureTest {

    @Test
    void implication() {
        assertTrue(LPStructure.implication(true, true));
    }

    @Test
    void multiplication() {
        assertTrue(LPStructure.multiplication(true, true));
    }

    @Test
    void sum() {
        assertTrue(LPStructure.sum(true, false));
    }
}