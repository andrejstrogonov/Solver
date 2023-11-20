package java.com.andreistrogonov;

import main.java.com.andreistrogonov.Parser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class MainTest {
    @Test
    public void testAdd() {
        assertTrue(Parser.weightCalculator(50,"normal", "male"));}
    @Test
    public void testLife(){
        assertEquals(67, Parser.basicLifeExpectancy(25, "female"));
        assertEquals(67, Parser.basicLifeExpectancy(54, "female"));
        assertNotEquals(67, Parser.basicLifeExpectancy(23, "female"));
        assertNotEquals(67, Parser.basicLifeExpectancy(20, "male"));
        assertNotEquals(67, Parser.basicLifeExpectancy(25, "male"));}
    @Test
    public void testRule13() {
        assertEquals("redundant", Parser.relativeWeight(85, "small", "female"));
        assertEquals("redundant", Parser.relativeWeight(86, "small", "female"));
        assertNotEquals("redundant", Parser.relativeWeight(45, "small", "female"));
        assertNotEquals("redundant", Parser.relativeWeight(85, "large", "female"));
        assertNotEquals("redundant", Parser.relativeWeight(85, "small", "male"));
        assertNotEquals("redundant", Parser.relativeWeight(45, "large", "female"));
        assertNotEquals("redundant", Parser.relativeWeight(87, "large", "male"));
        assertNotEquals("redundant", Parser.relativeWeight(45, "small", "male"));
        assertNotEquals("redundant", Parser.relativeWeight(45, "large", "male"));
    }
    @Test
    public void testRule14() {
        assertEquals("redundant", Parser.relativeWeight(55, "small", "female"));
        assertEquals("redundant", Parser.relativeWeight(84, "small", "female"));
        assertEquals("redundant", Parser.relativeWeight(65, "small", "female"));
        assertNotEquals("redundant", Parser.relativeWeight(45, "small", "female"));
        assertNotEquals("redundant", Parser.relativeWeight(82, "large", "female"));
        assertNotEquals("redundant", Parser.relativeWeight(82, "small", "male"));
        assertNotEquals("redundant", Parser.relativeWeight(45, "large", "female"));
        assertNotEquals("redundant", Parser.relativeWeight(82, "large", "male"));
        assertNotEquals("redundant", Parser.relativeWeight(45, "small", "male"));
        assertNotEquals("redundant", Parser.relativeWeight(45, "largeе", "male"));
    }
    @Test
    public void testRule15() {
        assertEquals("insufficient", Parser.relativeWeight(55, "large", "-"));
        assertEquals("insufficient", Parser.relativeWeight(45, "large", "-"));
        assertEquals("insufficient", Parser.relativeWeight(45, "large", "м"));
        assertEquals("insufficient", Parser.relativeWeight(55, "large", "ж"));

        assertNotEquals("insufficient", Parser.relativeWeight(45, "small", "-"));
        assertNotEquals("insufficient", Parser.relativeWeight(55, "small", "-"));
        assertNotEquals("insufficient", Parser.relativeWeight(56, "large", "-"));
        assertNotEquals("insufficient", Parser.relativeWeight(45, "small", "м"));
        assertNotEquals("insufficient", Parser.relativeWeight(55, "small", "ж"));
        assertNotEquals("insufficient", Parser.relativeWeight(56, "large", "м"));
        assertNotEquals("insufficient", Parser.relativeWeight(56, "large", "ж"));
    }
}