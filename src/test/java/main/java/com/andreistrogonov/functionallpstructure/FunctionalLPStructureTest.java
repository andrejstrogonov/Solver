package main.java.com.andreistrogonov.functionallpstructure;

import main.java.com.andreistrogonov.basicstructures.FunctionalLPStructure;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class FunctionalLPStructureTest {
    @Test
    void testAdd(){
        when(FunctionalLPStructure.add(2,3)).thenReturn(5);
    }
    @Test
    void testMultiply(){
        when(FunctionalLPStructure.multiply(2,3)).thenReturn(6);
    }



}
