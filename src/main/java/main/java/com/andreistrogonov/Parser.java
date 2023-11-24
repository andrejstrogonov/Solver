package main.java.com.andreistrogonov;

import java.util.Objects;

public class Parser {

    public static boolean weightCalculator(int i, String normal, String male) {
        return i >= 50 && Objects.equals(normal, "normal") && Objects.equals(male, "male");
    }

    public static int basicLWomanifeExpectancy(String female) {
        return 67;
    }

    public static int basicManLifeExpectancy(String male) {
        return 67;
    }

    public static String secondWeightCalculator(int i, String small, String female) {
        return "redundant";
    }
}
