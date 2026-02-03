package TUTORIAL_YT.JAVA_BASICS;
//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class SI {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principal:");
        float P = sc.nextFloat();
        System.out.println("Enter Time:");
        float T = sc.nextFloat();
        System.out.println("Enter Rate:");
        float R = sc.nextFloat();
        float SI = (P * T * R) / 100;
        System.out.println("Simple Interest is: " + SI);
    }
    
}
