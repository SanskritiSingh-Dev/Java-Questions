//Write a Java method to compute the average of three numbers..
package functions;
import java.util.Scanner;

public class function11 {
    public static int averageOfNum(int a, int b, int c){
        return (a+b+c)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers to find the average:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int avg = averageOfNum(a, b, c);
        System.out.println("The average of " + a + ", " + b + " and " + c + " is: " + avg);
    }
    
}
