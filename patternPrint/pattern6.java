/* inverted rotated pyramid pattern
    *
   **
  ***
 ****
 */

import java.util.Scanner;

public class pattern6 {

    public static void inverted_roated_pyramid(int n){
        for(int  i = 1; i<= n; i++){
            //spaces
            for(int j = 1; j<= n-i; j++){
                System.out.print("  ");
            }
            //stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            //next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        inverted_roated_pyramid(n);
        sc.close();
    }
    
}
