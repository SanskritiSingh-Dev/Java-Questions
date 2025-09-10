//floyd's triangle
/*
 1
 2 3
 4 5 6
 7 8 9 10
 11 12 13 14 15 ...
 */

import java.util.Scanner;

public class pattern8 {
    public static void floyds_triangle(int n){
        int counter= 1; //the number to be printed
        for(int i = 1; i <= n; i++){
            //how many times the counter will be printed in each row
            for(int j = 1; j <= i; j++){
                System.out.print(counter + " ");
                counter++; //increment the counter after printing
            }
            System.out.println(); //new line after each row
        }
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the number of rows for Floyd's Triangle: ");
        int n = sc.nextInt();
        System.out.println("Floyd's Triangle with " + n + " rows:");
        floyds_triangle(n);
        sc.close();
    } 
}
