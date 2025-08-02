package problems;
/* input: sides of the square
 * output: area of the square
 */
import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        float area = side * side;
        System.out.println("Area of Square is : " + area);
        sc.close();
    }
    
}
