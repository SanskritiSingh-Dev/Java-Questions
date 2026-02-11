import java.util.Scanner;

public class pyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int space = n - i; space > 0; space--) {
                System.out.print(" ");
            }
            // Print stars with spaces between them
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
