//linear search

public class linearSearch {
    public static int LinearSearch(int num[], int key){
        for(int i = 0; i < num.length; i++){
            if(num[i] == key){
                return 1;
            }
        }
        return -1; // if key is not found
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int key = 10; // you can change the key to test with different values. Will return 1
        //int key = 20; // you can change the key to test with different values. Will return 1
        //int key = 25; // you can change the key to test with different values. Will return -1
        //int key = 2; // you can change the key to test with different values. Will return 1
        int idx = LinearSearch(num, key);
        if(idx == -1){
            System.out.println("Key " + key + " not found in the array.");
        } else {
            System.out.println("Key " + key + " found in the array.");
        }
    }
    
    
}
