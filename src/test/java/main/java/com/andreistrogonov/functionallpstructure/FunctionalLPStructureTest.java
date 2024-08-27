package main.java.com.andreistrogonov.functionallpstructure;

import main.java.com.andreistrogonov.basicstructures.FunctionalForMockLPStructure;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class FunctionalLPStructureTest {
    @Test
    void testAdd(){
        when(FunctionalForMockLPStructure.add(2,3)).thenReturn(5);
    }
    @Test
    void testMultiply(){
        when(FunctionalForMockLPStructure.multiply(2,3)).thenReturn(6);
    }
    @Test
    void testImplication(){
        when(FunctionalForMockLPStructure.implication(true,false)).thenReturn(true);
    }



}
