//print all the numbers which are prime between the given range

package Functions;

import java.util.Scanner;
public class function8 {
    // Function to check if a number is prime
    public static boolean isPrime(int n){
        if(n == 2){
            return true; // 2 is prime
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){ 
                return false; 
            }
        }
            return true;
    }
    // Function to print all prime numbers in the range from 2 to n
    public static void PrimeInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.println("prime numbers are : ");
                System.out.println(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range to find prime numbers: ");
        int n = sc.nextInt();
        PrimeInRange(n);
        sc.close();
    }  
}
