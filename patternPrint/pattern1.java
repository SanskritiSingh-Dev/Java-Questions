/* 
Print this pattern
 *
 * *
 * * *
 * * * *
 
 */


import java.util.*;
public class pattern1{
    public static void main(String[] args) {
        int n; // no. of lines (4)
        int s; //no. of stars
        for(n = 1; n<=4 ; n++){
            for(s = 1; s<=n; s++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
