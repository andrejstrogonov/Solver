package main.java.com.andreistrogonov;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


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