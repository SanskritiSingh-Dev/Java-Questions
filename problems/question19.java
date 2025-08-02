package problems;
// print square pattern 

/* 
   * * * *
   * * * *
   * * * * 
   * * * * 
 */

 
import java.util.Scanner;
public class question19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();
        System.out.println("thesquare pattern is : ");
        for(int i = 0; i < n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}
