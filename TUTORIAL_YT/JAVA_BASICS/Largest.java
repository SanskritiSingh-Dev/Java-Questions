package TUTORIAL_YT.JAVA_BASICS;
//Take 2 numbers as input and print the largest number

import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println(num1 + " is the largest number.");
        } else if(num2 > num1){
            System.out.println(num2 + " is the largest number.");
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
    
}
