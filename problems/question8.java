package problems;
/* input : Enter the three numbers A, B, C
   output: Average of these numbers.
*/
import java.util.*;
public class question8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float A = sc.nextFloat();
        float B = sc.nextFloat();
        float C = sc.nextFloat();

        float avg = (A+B+C)/3;
        System.out.println("average of all three numbers: "+ avg);
        sc.close();
    }
}