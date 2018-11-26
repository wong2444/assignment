package week1;

import java.util.Scanner;
import java.io.*;

public class FatCoefficient {
    public static void main(String args[]) {
        double weight = 0, height = 0, FC = 0;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Fat Coefficient calculate");
            System.out.println("weight (kg):");
            weight = scanner.nextDouble();//get a input
            System.out.println("height (m):");
            height = scanner.nextDouble();
            System.out.println("FC:");
            FC = weight / (height * height);
            if (FC > 25) {
                System.out.println("Too Fat, need to keep fit!");
            } else if (FC < 15) {
                System.out.println("Too Thin, need to keep fat!");
            } else {
                System.out.println("Just fit, keep on!");
            }

        } catch (Exception e) {
            System.out.println("input error");
        }


    }
}