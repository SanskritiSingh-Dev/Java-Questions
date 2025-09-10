

public class largest {
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;   // Initialize to the smallest possible integer
        for(int i = 0; i < num.length; i++){
            if(num[i] > largest){
                largest = num[i]; // Update largest if current element is greater
            }

            if(num[i] < smallest){
                smallest = num[i]; // Update smallest if current element is smaller
            }
        }
        System.out.println("Smallest value in the array: " + smallest); // Print the smallest value found
        return largest; // Return the largest value found
    }

    public static void main(String[] args) {
        int num[] = {1,2, 3, 5, 6, 9, 1, 0};
        int largestValue = getLargest(num); // Call the method to find the largest value
        System.out.println("Largest value in the array: " + largestValue); // Print the largest value found
    }

    
}
