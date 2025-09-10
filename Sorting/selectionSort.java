//selection sort 
//n=5 arr={5,4,1,3,2}

public class selectionSort {

    public static void selection_sort(int arr[]){
        for(int i= 0; i<arr.length; i++){
            int min=i;
            for(int j = i+1; j<=arr.length-1; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            // Swap arr[i] and arr[min]
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    } 

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        selection_sort(arr);
        System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
    }
}