/* Write a Java method to compute the sum of the digits in an integer. 
(Hint: Approach this question in the following way:
 a. Take a variable sum = 0 
 b. Find the last digit of the number 
 c. Add it to the sum 
 d. Repeat a & b until the number becomes 0) */

package functions;
import java.util.Scanner;

public class function15 {
    public static void sumOfDigits(int n){
        int sum = 0;
        while(n > 0){
            int lastDigit = n % 10; // Get the last digit of the number
            sum = sum + lastDigit; // Add the last digit to the sum
            n = n / 10; // Remove the last digit
        }
        System.out.println("The sum of the digits is: " + sum); // Print the result
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt(); // Read the integer input
        sumOfDigits(n); // Call the method to compute the sum of digits
    }
}
