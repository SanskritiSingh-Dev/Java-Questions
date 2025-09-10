// display all the numbers entered by user except multiples of 10
package problems;

import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    while (true) {
        int n = sc.nextInt();
        if (n % 10 == 0) {
            break;
        }
        System.out.println(n);
    }
    sc.close();
    }
}
