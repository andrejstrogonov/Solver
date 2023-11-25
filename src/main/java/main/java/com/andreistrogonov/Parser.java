package main.java.com.andreistrogonov;

import java.util.Objects;

public class Parser {


    public static boolean weightCalculator(int i, String normal, String male) {
        return i >= 50 && Objects.equals(normal, "normal") && Objects.equals(male, "male");
    }

    public static int basicLWomanifeExpectancy() {
        return 67;
    }

    public static int basicManLifeExpectancy() {
        return 67;
    }

    public static boolean secondWeightCalculator(int age, String small, String female) {
       return age>=45 && Objects.equals(small,"small") && Objects.equals(female,"female");

    }
}
