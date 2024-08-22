package main.java.com.andreistrogonov.basicstructures;

import java.util.Arrays;

public interface FunctionalLPStructure {

    static int sum() {
        int[] facts = {1,2,3};
        return Arrays.stream(facts).sum();
    }

    static int add(int i, int i1){
        return i+i1;
    }

    static int multiply(int i, int i1) {
        return i*i1;
    }
}
