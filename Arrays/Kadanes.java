// max of subarray sum using kadane's algorithm
public class Kadanes {
    public static void kadanes(int num[]){
        int ms = Integer.MIN_VALUE; // max sum
        int cs = 0; // current sum
        for(int i = 0; i < num.length; i++){
            cs += num[i]; // add current element to current sum
            if(cs < 0) {
                cs = 0; // reset current sum if it goes negative
            }
            ms = Math.max(ms, cs); // update max sum if current sum is greater
        }
        System.out.println("Maximum subarray sum is: " + ms);
    }
    public static void main(String[] args) {
        int num[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        kadanes(num); // calling the kadanes function
        // Output: Maximum subarray sum is: 7

        //int num2[] = {-1, -2, -3, -4}; // all negative numbers
        //we have to create some special case for all negative numbers

        //int num3[] = {1, 2, 3, 4, 5}; // all positive numbers
        //kadanes(num3); // calling the kadanes function
        // Output: Maximum subarray sum is: 15

        //int num4[] = {0, 0, 0, 0}; // all zeros
        //kadanes(num4); // calling the kadanes function
        // Output: Maximum subarray sum is: 0    
        
    }
}