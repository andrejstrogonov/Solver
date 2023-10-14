package org.andreistrogonov.solver;

public class Parser {

    public static boolean weightCalculator(int i, String normal, String male) {
        return i >= 50 && normal == "normal" && male == "male";
    }

    public static int basicLifeExpectancy(int age, String gender) {
        if (age >= 25 && age < 55 && gender.equals("ж")) {
            return 67;
        }

        return 62;
    }

    public static String relativeWeight(int weight, String bodyType, String gender) {

        if (weight >= 85 && bodyType.equals("мелкое") && gender.equals("ж")) {
            return "излишний";
        }

        if (weight >= 55 && weight < 85 && bodyType.equals("мелкое") && gender.equals("ж")) {
            return "излишний";
        }

        if (weight <= 55 && bodyType.equals("крупное")) {
            return "недостаточный";
        }

        return "нормальный";

    }

}
