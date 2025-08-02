//print rverse of the given number
package problems;
 
public class question21 {
    public static void main(String[] args) {
        int n = 10899;
        int rev = 0;
        while(n > 0){
            int lastDigit = n % 10;
            rev = (rev * 10 ) + lastDigit;// print without newline
            n = n / 10;                   // update n to remove last digit
        }

        System.out.println(rev);  // move to next line 
    }
    
}
