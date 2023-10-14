package org.andreistrogonov.solver;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.andreistrogonov.solver.enums.BodyType;
import org.andreistrogonov.solver.enums.Gender;
import org.andreistrogonov.solver.enums.RelativeWeight;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MainTest {
    @Test
    public void testAdd() {
        // Правила 9-12 (Иван Белый)
        assertEquals(62, Parser.calculateBasicLifeExpectancy(30, Gender.MALE));
        assertEquals(64, Parser.calculateBasicLifeExpectancy(60, Gender.FEMALE));
        assertEquals(60, Parser.calculateBasicLifeExpectancy(60, Gender.MALE));
        assertEquals(62, Parser.calculateBasicLifeExpectancy(50, Gender.FEMALE));

        assertEquals(RelativeWeight.NORMAL,
            Parser.calculateRelativeWeight(50, BodyType.LARGE, Gender.FEMALE));
        assertEquals(RelativeWeight.NORMAL,
            Parser.calculateRelativeWeight(60, BodyType.LARGE, Gender.MALE));
    }
}
