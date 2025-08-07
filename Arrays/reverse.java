//reverse of an array
import java.util.*;
public class reverse {
    public static void reverseOfArray(int num[]){
        int first = 0;
        int last = num.length - 1;
        while(first < last){
            //swap
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(num));
        reverseOfArray(num);
        System.out.println("Reversed Array: " + Arrays.toString(num));
        // Output: Original Array: [1, 2, 3, 4, 5]
        //         Reversed Array: [5, 4, 3, 2, 1]
        // Time Complexity: O(n)
        // Space Complexity: O(1)
    }
    
}
