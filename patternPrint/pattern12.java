/* hollwo rhombus
    * * * * * 
   *       *
  *       *
 *       *
* * * * * 




 */

import java.util.Scanner;

public class pattern12 {
    public static void hollow_rhombus(int n){
        for(int i = 1; i <= n; i++){
            // spaces
            for(int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            //rectangle
            for(int  j = 1; j <= n; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the hollow rhombus: ");  
        int n = sc.nextInt();
        hollow_rhombus(n);
        sc.close();
    }
}
