package main.java.com.andreistrogonov.basicstructures;

import java.util.Arrays;

public interface FunctionalLPStructure {

    static int sum() {
        int[] facts = {1,2,3};
        return Arrays.stream(facts).sum();
    }
}
