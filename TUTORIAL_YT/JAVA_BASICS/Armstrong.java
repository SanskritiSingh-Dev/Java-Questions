package TUTORIAL_YT.JAVA_BASICS;
//To find Armstrong Number between two given number

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit: ");  
        int lower = sc.nextInt();
        System.out.println("Enter upper limit: ");
        int upper = sc.nextInt();
        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are: ");
        for(int num = lower; num <= upper; num++){
            int originalNum = num;
            int sum = 0;
            int digits = String.valueOf(num).length();
            while(originalNum != 0){
                int digit = originalNum % 10;
                sum += Math.pow(digit, digits);
                originalNum /= 10;
            }
            if(sum == num){
                System.out.println(num);
            }
        }
    }
}
