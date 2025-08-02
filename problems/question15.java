package problems;

import java.util.Scanner;
public class question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int marks = sc.nextInt();
        String status = marks >= 33 ? "Pass" : "Fail";
        System.out.println("The student is : " + status);
    sc.close();
    }
}
