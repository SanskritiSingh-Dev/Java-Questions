// Question 27 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
package problems;
import java.util.Scanner;
public class question27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int n;
        int num;
        System.out.println("enterthr number of integers: ");
        n = sc.nextInt();
        System.out.println("Enter" + n + "integers: ");
        for(int i = 0; i< n; i++){
            num = sc.nextInt();

            if(num %2 == 0){
                evenSum = evenSum + num;
            }
            else{
                oddSum = oddSum + num;
            }
        }
        System.out.println("Sum of even numbers : " + evenSum);
        System.out.println("Sum of odd numbers : " + oddSum);

    }
    
}
