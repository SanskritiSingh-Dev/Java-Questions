package TUTORIAL_YT.JAVA_BASICS;
//Input currency in rupees and output in USD.

import java.util.Scanner;
public class RsToUSD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount in Rupees: ");
        double rupees = sc.nextDouble();
        double usd = rupees / 82.0;
        System.out.println("Amount in USD: " + usd);
    }
    
}
