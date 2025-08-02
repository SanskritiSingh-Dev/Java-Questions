//factorial of n number n!
// n! = (n-1)!*n ascending order
//eg. 4! = 1*2*3*4
package functions;

import java.util.Scanner;

public class function4 {

    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println("Factorial of number " + n + " is : " + fact);
        
    }
    
}
