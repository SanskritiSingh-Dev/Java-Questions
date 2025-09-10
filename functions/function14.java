/*Use the following methods of the Math class in Java: 
Math.min( ), 
Math.max( ), 
Math.sqrt( ), 
Math.pow( ), 
Math.abs( ).*/

package Functions;

public class function14 {
    public static void main(String[] args) {
        int a = -4;
        int b = 9;
        System.out.println("Using Math class methods on a = " + a + " and b = " + b + ":");
        System.out.println("Minimum: " + Math.min(a, b));
        System.out.println("Maximum: " + Math.max(a, b));
        System.out.println("Square root of a: " + Math.sqrt(a));
        System.out.println("Square root of b: " + Math.sqrt(b));
        System.out.println("a squared: " + Math.pow(a, 2));
        System.out.println("b squared: " + Math.pow(b, 2));
        System.out.println("Absolute value of a: " + Math.abs(a));
        System.out.println("Absolute value of b: " + Math.abs(b));
    }

    
}
