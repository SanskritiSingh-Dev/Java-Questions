package Functions;

import java.util.Scanner;

public class function1 {

    public static int calSum(int num1, int num2) { // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calSum(a, b); // arguments or actual parameters
        System.out.println("Them sum is :" + sum);
        sc.close();
    }

}
