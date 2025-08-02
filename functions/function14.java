/*Use the following methods of the Math class in Java: 
Math.min( ), 
Math.max( ), 
Math.sqrt( ), 
Math.pow( ), 
Math.abs( ).*/

package functions;

public class function14 {
    public static void MathClassMethods(int a, int b){
        // Using Math.min() to find the minimum of two numbers
        int min = Math.min(a, b);
        
        // Using Math.max() to find the maximum of two numbers
        int max = Math.max(a, b);
        
        // Using Math.sqrt() to find the square root of a number
        double sqrtA = Math.sqrt(a);
        double sqrtB = Math.sqrt(b);
        
        // Using Math.pow() to raise a number to a power
        double powerA = Math.pow(a, 2); // a squared
        double powerB = Math.pow(b, 2); // b squared
        
        // Using Math.abs() to find the absolute value of a number
        int absA = Math.abs(a);
        int absB = Math.abs(b);
    }
    public static void main(String[] args) {
        int a = -4;
        int b = 9;
        
        MathClassMethods(a, b);
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
