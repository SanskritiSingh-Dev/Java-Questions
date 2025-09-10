//product of two numbers

package Functions;

import java.util.Scanner;

public class function3 {
    public static int product(int a, int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int pro = product(a,b);
        System.out.println("the prduct of a and b is : " + pro);
        sc.close();
    }
    
}
