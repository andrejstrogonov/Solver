package main.java.com.andreistrogonov.functionallpstructure;

import main.java.com.andreistrogonov.basicstructures.FunctionalForMockLPStructure;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;
import static org.testcontainers.shaded.org.hamcrest.MatcherAssert.assertThat;

@RunWith(MockitoJUnitRunner.class)
class FunctionalLPStructureTest {
    @Test
    void testAdd(){
        assertThat(when(FunctionalForMockLPStructure.add(true,false)).thenReturn(true));

    }
    @Test
    void testMultiply(){
        when(FunctionalForMockLPStructure.multiply(true,false)).thenReturn(false);
    }
    @Test
    void testImplication(){
        when(FunctionalForMockLPStructure.implication(true,false)).thenReturn(true);
    }



}
