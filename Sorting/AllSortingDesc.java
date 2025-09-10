public class AllSortingDesc {
    // bubble sort
    public static void bubble_sort_desc(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // in decending
                if (arr[j] < arr[j + 1]) {
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    // insertion
    public static void insertion_sort_desc(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // finding the correct position to insert
            while (prev >= 0 && arr[prev] < curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            // insertion
            arr[prev + 1] = curr;
        }
    }

    // selection
    public static void selection_sort_desc(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int max = i;
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            // Swap arr[i] and arr[min]
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
    }

    // counting
    public static void counting_sort_desc(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // counting sorting
        int j = 0;
        for (int i = count.length - 1; i >= 0; i--) {
            while (count[i] > 0) {
                arr[j++] = i;
                count[i]--;
            }
        }

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 3, 6, 2, 1, 8, 7, 4, 5, 3, 1 };

        int[] arrBubble = arr.clone();
        int[] arrSelection = arr.clone();
        int[] arrInsertion = arr.clone();
        int[] arrCounting = arr.clone();

        bubble_sort_desc(arrBubble);
        selection_sort_desc(arrSelection);
        insertion_sort_desc(arrInsertion);
        counting_sort_desc(arrCounting);

        System.out.println("bubble sort in descending: ");
        printArr(arrBubble);
        System.out.println("selection sort in descending: ");
        printArr(arrSelection);
        System.out.println("insertion sort in descending: ");
        printArr(arrInsertion);
        System.out.println("counting sort in descending: ");
        printArr(arrCounting);
    }
}
