//Given an integer array nums, return true  if any value appears at least twice in the array, and return false if every element is distinct

import java.util.*;

public class numAppearance {
    public static boolean NumAppearance(int nums[]) { // Function to check for duplicates
        if (nums.length == 0)
            return false; // If the array is empty, return false
        if (nums.length == 1)
            return false; // If the array has only one element, return false
        // Loop through the array to find duplicates
        for (int i = 0; i < nums.length - 1; i++) {// 1st value
            for (int j = i + 1; j < nums.length; j++) { // 2nd value
                if (nums[i] == nums[j]) {
                    return true; // If a duplicate is found, return true
                }
            }
        }
        return false; // If no duplicates are found, return false
    }

    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 4, 5}; // Example array with no duplicates
        System.out.println("Does the array have duplicates? " + NumAppearance(nums)); // Output: false

        int nums2[] = {1, 2, 3, 4, 5, 1}; // Example array with duplicates
        System.out.println("Does the array have duplicates? " + NumAppearance(nums2)); // Output: true
    }

}

//using hashset
// public class Solution {
//     public int findDuplicate(int[] nums) {
//         // Phase 1: Find meeting point inside the cycle
//         int slow = nums[0];
//         int fast = nums[0];

//         do {
//             slow = nums[slow];         // move 1 step
//             fast = nums[nums[fast]];   // move 2 steps
//         } while (slow != fast);

//         // Phase 2: Find the start of the cycle (duplicate number)
//         slow = nums[0];
//         while (slow != fast) {
//             slow = nums[slow];
//             fast = nums[fast];
//         }

//         return slow; // duplicate number
//     }
// }

