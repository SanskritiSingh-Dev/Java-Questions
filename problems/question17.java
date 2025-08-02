package problems;
//print number from 1 to n
import java.util.Scanner;
public class question17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n = sc.nextInt();
        int counter = 1;
        while(counter <= n){
            System.out.println(counter);
            counter++;
        }
        sc.close();
    }
    
}
