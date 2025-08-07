//Max subarray sum using prefix sum technique

import java.util.*;
public class PrefixSumTech {
    public static void maxSubArraySum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0]; // Initialize the first element of prefix sum array

        //calcuclate prefix array
        for(int i = 1; i < prefix.length; i++){
            prefix[i] = prefix[i - 1] + num[i];
        }

        for(int i = 0; i < num.length; i++){
            int start = i;

            for(int j = i; j < num.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("maximum subarray sum is: " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        maxSubArraySum(num);
    }
    
}