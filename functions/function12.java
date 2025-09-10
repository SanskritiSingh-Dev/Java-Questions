//Writea method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method.

package Functions;

import java.util.Scanner;

public class function12 {
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: "); 
        int num = sc.nextInt();
        System.out.println("Is the number even? " + isEven(num));
        sc.close();
    }
    
}
