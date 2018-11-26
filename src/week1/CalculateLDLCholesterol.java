package week1;

import java.util.Scanner;

public class CalculateLDLCholesterol {
    public static void main(String args[]) {
        double TC, HDLC, TG, LDLC;
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("LDL Cholesterol calculate");
            System.out.println("Total Cholesterol (TC):");
            TC = scanner.nextDouble();//get a input
            System.out.println("HDL cholesterol (HDLC):");
            HDLC = scanner.nextDouble();
            System.out.println("triglyceride:");
            TG = scanner.nextDouble();

            LDLC = TC - HDLC - TG / 5;
            System.out.println("LDL cholesterol (LDLC):" + LDLC);
        }catch (Exception e){
            System.out.println("input error");
        }


    }
}
