//Given n non-negitive integer, representing an elevation map where the width of the bar is 1, compute how much water it can trap after raining.

import java.util.*;
public class trappingRainwater {
    public static int trap(int height[]){
        int n = height.length;
        // Edge case: if the array is empty or has less than 3 elements, no water can be trapped.
        if (n < 3) {
            return 0;
        }
        //left max boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);
        }
        
        //right max boundary -array

        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i >=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        //loop  to find the water level and trapped water
        int trappedWater = 0;
        for(int i = 0; i < n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5}; 
        System.out.println("Trapped water: " + trap(height)); 
        // Example usage with a different elevation map
        int height2[] = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped water: " + trap(height2));
        // Example with no water trapped
        int height3[] = {1, 2, 3, 4, 5};
        System.out.println("Trapped water: " + trap(height3));
        // Example with all heights the same
        int height4[] = {3, 3, 3, 3, 3};
        System.out.println("Trapped water: " + trap(height4));
    }
}