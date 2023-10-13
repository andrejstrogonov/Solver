package org.andreistrogonov.solver;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** 
 * Tests from <b>9</b> to <b>12</b>.
 * @author Ivan Belyj
*/
public class Tests9_12 {
    private static int basicLifeExpectancy(int age, String gender) {
        // Rules file (Health.exp) uses cyrillic symbols
        if (age >= 25 && age <= 55 && gender.equals("м")) {
            return 62;
        }

        if (age >= 55 && gender.equals("ж")) {
            return 64;
        }

        if (age >= 55 && gender.equals("м")) {
            return 60;
        }
        
        // if (age <= 55 && gender.equals("ж")) {
        //     return 62;
        // }

        return 62; // default value
    }


    private static String relativeWeight(int weight, String bodyType, String gender) {
        if (weight <= 55 && bodyType == "мелкое" && gender == "ж") {
            return "нормальный";
        }
        return "нормальный"; // default
    }

    public static void testRules() {
        assertEquals(62, Tests9_12.basicLifeExpectancy(30, "м"));
        assertEquals(64, Tests9_12.basicLifeExpectancy(60, "ж"));
        assertEquals(60, Tests9_12.basicLifeExpectancy(60, "м"));
        assertEquals(62, Tests9_12.basicLifeExpectancy(50, "ж"));

        assertEquals("нормальный",
            Tests9_12.relativeWeight(50, "мелкое", "ж"));
        assertEquals("нормальный",
            Tests9_12.relativeWeight(60, "крупное", "м"));
    }
}
