//Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not) A number is called a palindrome if the number is equal to the reverse of a number e.g., 121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321.

package functions;

import java.util.Scanner;

public class function13 {
    public static boolean isPalindrome(int n){
        int org = n;
        int rev = 0;
        while(n > 0){
            int lastDigit = n % 10; //to get the last digit
            rev = (rev * 10) + lastDigit;
            n = n / 10; //to reduce the number
        }
        if(org == rev){
            return true; //if original number is equal to the reversed number
        }
        else{
            return false; //if original number is not equal to the reversed number
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(isPalindrome(n)){
            System.out.println(n + " is a palindrome.");
        } else {
            System.out.println(n + " is not a palindrome.");
        }
    }
    
}
