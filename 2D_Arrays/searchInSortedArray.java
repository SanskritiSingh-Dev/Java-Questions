public class searchInSortedArray {

    // Method to search for the 'key' in the sorted matrix using Staircase Search approach
    public static boolean stairCaseSearch(int matrix[][], int key) {
        int row = 0;                      // Start from the topmost row
        int col = matrix[0].length - 1;   // Start from the rightmost column

        // Traverse the matrix while the indices are within bounds
        while(row < matrix.length && col >= 0) {
            if(matrix[row][col] == key) {
                // If the key is found at the current cell, print the position and return true
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            } else if(key < matrix[row][col]) {
                // If the key is smaller than the current cell, move left in the same row
                col--;
            } else {
                // If the key is larger than the current cell, move down to the next row
                row++;
            }
        }
        
        // If the entire matrix is traversed and key is not found, print a message and return false
        System.out.println("Key not found!");
        return false;
    }

    public static void main(String[] args) {
        // Define a sorted 2D matrix where rows and columns are in ascending order
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        
        int key = 33;  // The value we want to search in the matrix
        
        // Call the search method with the matrix and the key
        stairCaseSearch(matrix, key);
    }
}

