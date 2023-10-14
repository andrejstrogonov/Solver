package org.andreistrogonov.solver;

import org.andreistrogonov.solver.enums.BodyType;
import org.andreistrogonov.solver.enums.Gender;
import org.andreistrogonov.solver.enums.RelativeWeight;

public class Parser {
    private static int[] basicLifeExpectancies = new int[] { 62, 64, 60 };
    public static Integer calculateBasicLifeExpectancy(int age, Gender gender) {
        return switch (gender) {
            case MALE -> {
                if (age >= 25 && age <= 55) {
                    yield Parser.basicLifeExpectancies[0];
                } else if (age >= 55) {
                    yield Parser.basicLifeExpectancies[2];
                } else {
                    yield null;
                }
            }
            case FEMALE -> {
                if (age >= 55) {
                    yield Parser.basicLifeExpectancies[1];
                } else {
                    yield null;
                }
            }
            default -> null;
        };
    }
}