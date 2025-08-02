package problems;

import java.util.Scanner;

public class question13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        if (A>=B && A>=C){
            System.out.println("A number is greatest");
        }
        else if (B>=C){
            System.out.println("Bis the greatest number");
        }
        else{
            System.out.println("C is the greatest number");
        }
        sc.close();
    }
    
}
