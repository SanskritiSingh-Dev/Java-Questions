package problems;
//print the number in reverse order

import java.util.Scanner;

public class question20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Reverse of the number is: ");
        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);  // print without newline
            n = n / 10;                   // update n to remove last digit
        }

        System.out.println();  // move to next line after loop
        sc.close();
    }
}
