package main.com.andreistrogonov.solver;

import main.java.com.andreistrogonov.Parser;
import org.junit.Test;

import static org.junit.Assert.*;


public class MainTest {
    @Test
    public void testAdd() {
        assertTrue(Parser.weightCalculator(50,"normal", "male"));}
    @Test
    public void testLife(){
        assertEquals(67, Parser.basicLWomanifeExpectancy());
        assertEquals(67,Parser.basicManLifeExpectancy());}
    @Test
    public void testRule13() {
        assertTrue(Parser.secondWeightCalculator(45,"small","female")); }

}