package problems;
import java.util.Scanner;

public class question9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the value of 'a': ");
        int a = sc.nextInt();
        System.out.println("Enter the value of 'b': ");
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+' : int sum = a + b;
                System.out.println("The sum is : " + sum);
                break;
            case '-' : int minus = a - b;
                System.out.println("The substraction is : " + minus);
                break;
            case '*' : int product = a * b;
                System.out.println("The product is : " + product);
                break;
            case '/' : int divide = a / b;
            if(b == 0){
                System.out.println("b cannot be zero");
            }
            else{
                System.out.println("The division is : " + divide);
            }
                break;
            case '%' : int mod = a % b;
                if(b == 0){
                    System.out.println("b cannot be zero");
                }
                else{
                    System.out.println("The reminder is : " + mod);
                }
                    break;
            default: System.out.println("oops! you entered the wrong operator..." );
                break;
        }
        sc.close();

    }
}
