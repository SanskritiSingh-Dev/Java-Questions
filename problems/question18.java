package problems;
// print sum of first n natural numbers.

import java.util.Scanner;

public class question18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //how many natural numbers are there
        int sum = 0; //initial sum is 0
        int i = 1; // starting the count with 1
        while( i <= n ){ //counting is less than natural numbers.
            sum = sum + i; //sum will increment by i value 1+2+3+4+...
            i++;
        }
        System.out.println("Sum of the first natural number is : " + sum);
        sc.close();
    }
    
}
