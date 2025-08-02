package problems;

import java.util.Scanner;

public class question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if(income < 500000){
            int tax = 0;
        }
        else if(income > 500000 && income < 1000000){
            int tax = (int) (income * 0.2);
        }
        else{
            int tax = (int) (income * 0.3);
        }
        sc.close();
    }
    
}
