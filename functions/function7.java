//prime or not
package Functions;
import java.util.Scanner;

public class function7 {

    // naive way to do it

    public static boolean isPrimeNaive(int n){
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                return false; 
            }
        }
        return true;
    }

    public static void mainNaive(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (isPrimeNaive(n)) {
            System.out.println("Prime");
        }
        else {
            System.out.println("not prime");
        }
        sc.close();
    }



    //optimized way to do it
    
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
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if (isPrime(n)) {
            System.out.println("Prime");
        }
        else {
            System.out.println("not prime");
        }
        sc.close();
    }
    
}
