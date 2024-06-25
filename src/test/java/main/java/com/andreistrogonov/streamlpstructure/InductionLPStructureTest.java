package main.java.com.andreistrogonov.streamlpstructure;

import main.java.com.andreistrogonov.basicstructures.InductionLPStructure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InductionLPStructureTest {
    @Test
    void sum(){
        assertEquals(6, InductionLPStructure.sum(1, 2, 3));
    }

    @Test
    void multiplication(){
        assertEquals(6, InductionLPStructure.multiplication(1, 2, 3));
    }


}
