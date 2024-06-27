package main.java.com.andreistrogonov.functionallpstructure;

import main.java.com.andreistrogonov.data.stream.Facts;
import org.junit.jupiter.api.Test;
import main.java.com.andreistrogonov.basicstructures.FunctionalLPStructure;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionalLPStructureTest {
    @Mock
    ArrayList<Facts> factsArrayList;

    @Test
    void sum(){
        assertEquals(6,FunctionalLPStructure.sum());
    }
}
