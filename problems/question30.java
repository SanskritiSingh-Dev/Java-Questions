//Question 5 : What is wrong in the following program?

package problems;

public class question30 {
    public static void main(String[] args) {
        int i; // Declare 'i' outside the loop
        for (i = 0; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("i after the loop = " + i);
    }
}
