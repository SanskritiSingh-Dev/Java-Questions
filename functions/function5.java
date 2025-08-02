//binomial coefficient
// nCr = n!/r!(n-r)!
package functions;

import java.util.Scanner;

public class function5 {

    public static int factorial(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static int binCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n-r);
        int BC = n_fact/(r_fact * nr_fact);
        return BC;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int binomial_coefficient = binCoeff(n, r);
        System.out.println("The binomial coefficient of " + n + " and " + r + " is : " + binomial_coefficient);
        
    }
    
}
