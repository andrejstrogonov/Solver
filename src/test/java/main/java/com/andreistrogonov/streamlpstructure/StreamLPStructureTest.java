package main.java.com.andreistrogonov.streamlpstructure;

import main.java.com.andreistrogonov.basicstructures.StreamLPStructure;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StreamLPStructureTest {
    @Test
    void sum(){
        assertEquals(StreamLPStructure.sum(1,2,3),6);
    }

    @Test
    void multiplication(){
        assertEquals(StreamLPStructure.multiplication(1,2,3),6);
    }


}
