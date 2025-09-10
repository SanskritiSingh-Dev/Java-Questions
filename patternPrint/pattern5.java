//hollow rectange pattern

import java.util.Scanner;

public class pattern5 {
    public static void hollow_rectangle(int totalRow, int totalCol){
        //outer
        for(int i = 1; i <= totalRow; i++){
            //inner
            for(int j = 1; j <= totalCol; j++){
                //cell - (i,j)
                if(i == 1 || i == totalRow || j == 1 || j == totalCol){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  "); // double space is used to create a hollow effect
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int totalRow = sc.nextInt(); // Read the number of rows
        System.out.print("Enter the number of columns: ");
        int totalCol = sc.nextInt(); // Read the number of columns
        hollow_rectangle(totalRow, totalCol); // Call the method to print the hollow rectangle pattern
        sc.close();
    }
    
}
