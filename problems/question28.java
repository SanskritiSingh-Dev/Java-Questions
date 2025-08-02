//Write a program to find the factorial of any non-negative number entered by the user. Hint: Factorial of a number n (written as n!) is calculated as n * (n-1) * (n-2) * ... * 1. By definition, 0! = 1.
package problems;
import java.util.Scanner;
public class question28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the factorial of : ");
        int n = sc.nextInt();
        int fact = 1;
        if( n == 0 || n == 1){
            System.out.println("The factorial is 1");
        }
        else if (n == 2){
            System.out.println("The factorial is 2");
        }
        else{
            for(int i = 1; i <= n ; i++){
                fact = fact * i;
            }
            System.out.println("Factorial is : " + fact);
        }
        sc.close();
    }
    
}
