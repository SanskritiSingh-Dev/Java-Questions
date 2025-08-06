//buttefly pattern

/*

 *             *
 * *         * *
 * * *     * * *
 * * * * * * * *
 * * * * * * * *
 * * *     * * *
 * *         * *
 *             *

 */

 import java.util.Scanner;

 public class pattern10 {
 
     public static void butterfly(int n) {
         // 1st half
         for (int i = 1; i <= n; i++) {
             // Left stars
             for (int j = 1; j <= i; j++) {
                 System.out.print("* ");
             }
 
             // Spaces
             for (int j = 1; j <= 2 * (n - i); j++) {
                 System.out.print("  ");
             }
 
             // Right stars
             for (int j = 1; j <= i; j++) {
                 System.out.print("* ");
             }
 
             // Move to next line
             System.out.println();
         }
 
         // 2nd half
         for (int i = n; i >= 1; i--) {
             // Left stars
             for (int j = 1; j <= i; j++) {
                 System.out.print("* ");
             }
 
             // Spaces
             for (int j = 1; j <= 2 * (n - i); j++) {
                 System.out.print("  ");
             }
 
             // Right stars
             for (int j = 1; j <= i; j++) {
                 System.out.print("* ");
             }
 
             // Move to next line
             System.out.println();
         }
     }
 
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter the number of rows for the butterfly pattern: ");
         int n = sc.nextInt();
         butterfly(n);
         sc.close(); //close scanner
     }
 }
 
    
