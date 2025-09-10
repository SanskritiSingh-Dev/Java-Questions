

public class binarySearch {
    public static int BinarySearch(int num[], int key){
        // initializing the start and end index
        int start = 0;
        int end = num.length - 1;

        while(start <= end){
            int mid = (start + end) / 2;
            // if the key is found at mid index
            if(num[mid] == key){
                return mid; // return the index of the key
            }
            // if the key is less than the mid element, search in the left half
            else if(num[mid] > key){
                end = mid - 1;
            }
            // if the key is greater than the mid element, search in the right half
            else{
                start = mid + 1;
            }

        }
        return -1; // return -1 if the key is not found
        
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 10;
        int result = BinarySearch(num, key);
        if(result == -1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
    
}
