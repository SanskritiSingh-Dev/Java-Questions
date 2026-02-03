package TUTORIAL_YT.JAVA_BASICS;
//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class ArithmaticOp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        float num1 = sc.nextFloat();
        System.out.println("Enter second number:");
        float num2 = sc.nextFloat();
        System.out.println("Enter operator (+, -, *, /):");
        char operator = sc.next().charAt(0);
        float result;
        if(operator == '+'){
            result = num1 + num2;
            System.out.println("Result: " + result);
        } else if(operator == '-'){
            result = num1 - num2;
            System.out.println("Result: " + result);
        } else if(operator == '*'){
            result = num1 * num2;
            System.out.println("Result: " + result);
        } else if(operator == '/'){
            if(num2 != 0){
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero");
            }
        } else {
            System.out.println("Invalid operator");
        }
        
    }
    
}
