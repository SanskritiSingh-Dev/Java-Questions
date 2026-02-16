/*Armstrong Number : 
	An Armstrong number is a number where: Each digit is raised to the power of number of digits, The sum of those values equals the original number(153). */
import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int org = num;
        int digitCount = 0;
        while(num > 0){
            num = num/10;
            digitCount++;
        }
        num = org;
        for(int i = 1; i <= digitCount; i++){
            int digit = num % 10;
            sum = sum + (int)Math.pow(digit, digitCount);
            num =num /10;
        }   
        if(sum == org){
            System.out.println("armstrong number");
        }
        else{
            System.out.println("not an armstrong number");
        }
        sc.close();

    }
    
}
