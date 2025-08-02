//swapping of two numbers


package functions;

public class function2 {

    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of 'a' after swap: " + a);
        System.out.println("value of 'b' after swap: " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("value of 'a' before swap: " + a);
        System.out.println("value of 'b' before swap: " + b);
        swap(a, b);

    }
    
}
