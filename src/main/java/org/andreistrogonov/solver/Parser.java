package org.andreistrogonov.solver;

public class Parser {
    public static boolean weightCalculator(int i, String normal, String male) {
        return i >= 50 && normal == "normal" && male == "male";
    }


    public static boolean weightCalcUnderweight(int i, String underweight, String male) {
        return i < 50 && underweight.equals("underweight") && male.equals("male");
    }

    public static String coronaryRiskCalcBelow(String belowAvg) {
        if (belowAvg.equals("below the average")) {
            return "low";
        }
        return "undefined";
    }

    public static String coronaryRiskCalcAverage(String average) {
        if (average.equals("average")) {
            return "low";
        }
        return "undefined";
    }

    public static String checkStart(String start) {
        if (start.equals("yes")) {
            return "different";
        }
        return "undefined";
    }

    public static int lifetimeCalcFemale(int age, String female) {
        if (age <= 25 && female.equals("female")) {
            return 72;
        }
        return -1;
    }

    public static int lifetimeCalcMale(int age, String male) {
        if (age <= 25 && male.equals("male")) {
            return 67;
        }
        return -1;
    }






}
