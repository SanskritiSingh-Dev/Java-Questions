//decimal to binary

package Functions;

public class function10 {
    public static void decToBin(int n){
        int num = n;
        int power = 0;
        int binNum = 0;
        while(n>0){
            int rem = n % 2; //last digit
            binNum = binNum + (rem * (int)Math.pow(10, power));
            power++;
            n = n / 2; //remove last digit   
        }
        System.out.println("Decimal conversion of " + num + " is: " + binNum);                                     
    }

    public static void main(String[] args) {
        int decimalNum = 7; // decimal number to convert
        decToBin(decimalNum); // should print 111
    }
    
}
