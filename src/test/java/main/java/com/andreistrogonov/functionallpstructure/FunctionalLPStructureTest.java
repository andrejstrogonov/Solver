package main.java.com.andreistrogonov.functionallpstructure;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FunctionalLPStructureTest {
    @Mock
    ArrayList<Integer> factsArrayList;

    @Test
    void sum(){
        factsArrayList.add(1);
        factsArrayList.add(2);
        factsArrayList.add(3);
        factsArrayList.add(4);
        factsArrayList.add(5);
        Mockito.verify(factsArrayList).add(4);
        assertEquals(0,factsArrayList.size());
        Mockito.when(factsArrayList.size()).thenReturn(100);
        assertEquals(100,factsArrayList.size());
    }
}
