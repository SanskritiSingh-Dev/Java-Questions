// convert binary to decimal

package functions;

public class function9 {
    public static void binToDec(int binNum){
        int num = binNum;
        int power = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum % 10; //last digit
            decNum = decNum + (lastDigit * (int)Math.pow(2, power));
            power++;
            binNum = binNum / 10; //remove last digit   
        }
        System.out.println("Decimal conversion of " + num + " is: " + decNum);                                     
    }

    public static void main(String[] args) {
        int binaryNumber = 101; // Binary representation of 5
        binToDec(binaryNumber); // Should print: Decimal conversion of 101 is: 5
    }   
}
