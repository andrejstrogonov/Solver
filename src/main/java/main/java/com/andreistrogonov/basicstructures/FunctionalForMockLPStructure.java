package main.java.com.andreistrogonov.basicstructures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class FunctionalForMockLPStructure {
    @Autowired
    private final boolean a;

    @Autowired
    private final boolean b;


    public FunctionalForMockLPStructure(boolean a, boolean b) {
        this.a = a;
        this.b = b;
    }
    @Bean
    public static boolean add(boolean i, boolean i1) {
        return i|| i1;
    }
    @Bean
    public static boolean multiply(boolean i, boolean i1) {
        return i && i1;
    }
    @Bean
    public static boolean implication(boolean b, boolean b1) {
        return !b ||b1;
    }

}
