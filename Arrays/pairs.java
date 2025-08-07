//pairs in array

import java.util.*;

public class pairs {
    public static void pairPrint(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int curr = num[i];
            for (int j = i + 1; j < num.length; j++) {
                System.out.print("(" + curr + "," + num[j] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = { 1, 2, 3, 4, 5 };
        System.out.println("Pairs in the array are: ");
        pairPrint(num);
    }

}
