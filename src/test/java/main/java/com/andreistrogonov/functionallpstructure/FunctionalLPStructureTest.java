package main.java.com.andreistrogonov.functionallpstructure;

import org.junit.jupiter.api.Test;
import main.java.com.andreistrogonov.basicstructures.FunctionalLPStructure;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionalLPStructureTest {
    @Mock
    ArrayList<Integer> factsArrayList;

    @Test
    void sum(){
        factsArrayList.add(5);
        assertEquals(6,FunctionalLPStructure.sum());
    }
}
