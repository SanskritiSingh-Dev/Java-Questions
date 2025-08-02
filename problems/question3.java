//Question 3 : Write a Java program to input week number(1-7) and print day of week name using switch case.
package problems;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number: ");
        int num = sc.nextInt();
        switch (num) {
            case 1: System.out.println("MONDAY");
                break;
            case 2: System.out.println("TUESDAY");
                break;
            case 3: System.out.println("WEDNESDAY");
                break;
            case 4: System.out.println("THURSDAY");
                break;
            case 5: System.out.println("FRIDAY");
                break;
            case 6: System.out.println("SATURDAY");
                break;
            case 7: System.out.println("SUNDAY");
                break;
            default:System.out.println("oops! numbers after 7 is not allowed. Try again!");
                break;
        }
        sc.close();
        
    }
    
}
