//performing basic creation, insertion and searching operation on 2D arrays

import java.util.Scanner;
public class basicMatrix {
    public static boolean searchMatrix(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("Key found at position: (" + i + ", " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        //insertion
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        //printing the matrix
        System.out.println("The matrix is: ");
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //searching
        System.out.println("Enter the element to be searched: ");
        int key = sc.nextInt();
        searchMatrix(matrix, key);
        sc.close();
    }
    
}
