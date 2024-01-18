package main.java.com.andreistrogonov.lpstructure;

public interface LPStructure {
    static boolean sum(boolean a, boolean b) {
        return a || b;
    }

    static boolean multiplication(boolean a, boolean b) {
        return a && b;
    }

    static boolean implication(boolean a, boolean b) { return !a ||b; }
}
