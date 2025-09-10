//extract the subarrays from a given array



public class SubArray {
    public static void subArray(int num[]){
        for(int i = 0; i < num.length; i++){
            int start = i;
            for(int j = i; j < num.length; j++){
                int end = j;
                System.out.print("[");
                for(int k = start; k <= end; k++){
                    System.out.print(num[k]);
                    if(k < end) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        System.out.println("Subarrays of the given array are: ");
        subArray(num);
    }
    
}
