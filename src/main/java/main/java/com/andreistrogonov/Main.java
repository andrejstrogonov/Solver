package main.java.com.andreistrogonov;
// This is a personal academic project. Dear PVS-Studio, please check it.

// PVS-Studio Static Code Analyzer for C, C++, C#, and Java: https://pvs-studio.com
import main.java.com.andreistrogonov.data.atomic.Facts;
import main.java.com.andreistrogonov.lpstructure.LPStructure;

public class Main {
    public static void main(String[] args) {
        System.out.print(LPStructure.sum(true,false));
        System.out.print(LPStructure.multiplication(true,false));
        System.out.print(LPStructure.implication(true,false));
        Facts first = new Facts(true);
        Facts second = new Facts(false);
        System.out.print(LPStructure.sum(first.first_argument(),second.first_argument()));
    }
}
