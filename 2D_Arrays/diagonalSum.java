//find the sum of the diagonal of an matrix. 
//eg. { 
// {1,2,3,4}, 
// {5,6,7,8}, 
// {9,10,11,12}, 
// {13,14,15,16} 
// } 
//output: sum = 68;
public class diagonalSum {
    public static void diagonal_Sum(int matrix[][]) {
        int sum = 0;
        
        for(int i = 0; i < matrix.length; i++) {
            // Primary diagonal
            sum += matrix[i][i];
            
            // Secondary diagonal
            if(i != matrix.length - 1 - i) { 
                sum += matrix[i][matrix.length - 1 - i];
            }
        }
        
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        
        diagonal_Sum(matrix);
    }
}

