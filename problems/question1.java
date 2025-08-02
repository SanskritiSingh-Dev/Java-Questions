//Question 1 : Write a Java program to get a number from the user and print whether it is positive or negative

package problems;

import java.util.Scanner;

public class question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want: ");
        int num = sc.nextInt();
        if(num >= 0){
            System.out.println("the number is poitive.");
        }
        else{
            System.out.println("the number is negitive.");
        }
        sc.close();

    }

    
}
