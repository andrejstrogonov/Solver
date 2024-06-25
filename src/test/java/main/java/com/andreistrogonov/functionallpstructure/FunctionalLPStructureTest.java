package main.java.com.andreistrogonov.functionallpstructure;

import org.junit.jupiter.api.Test;
import main.java.com.andreistrogonov.basicstructures.FunctionalLPStructure;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionalLPStructureTest {
    @Test
    void sum(){
        assertEquals(6,FunctionalLPStructure.sum());
    }
}
