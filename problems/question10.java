package problems;
/* input: price of pen, pencil, eraser
 * output: total cost of the item back to the user as there bill.
 */
import java.util.Scanner;

public class question10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float pencile = sc.nextFloat();
        System.out.println("The Bill of items: ");
        System.out.println("Pen : " + pen);
        System.out.println("Pencile : " + pencile);
        System.out.println("Eraser : "+ eraser);
        float totalCost = pen+pencile+eraser;
        System.out.println("total : " + totalCost);
        sc.close();
    }
    
}
