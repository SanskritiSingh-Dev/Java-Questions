//**Q4: Write a java program to print the multiplication table of a number N entered by the user.**


package problems;
import java.util.Scanner;
public class question29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want multiplication table of : ");
        int n = sc.nextInt();
        int multiply;
        for(int i = 1; i<= 10 ; i++){
            multiply = n * i;
            System.out.println( n + "x" + i + "=" +  multiply);
        }
        
        sc.close();
    }
}
