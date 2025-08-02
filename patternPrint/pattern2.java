/* 
Inverted star
 * * * * 
 * * * 
 * * 
 * 
 
 */




public class pattern2 {
    public static void main(String[] args) {
        int n;
        int s;
        for(n = 1 ; n<=4 ; n++){
            for(s = 1; s<=4-n+1; s++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
