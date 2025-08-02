//overloading using parameters


package functions;

public class function6 {
    public static int sum1 (int a, int b){
        return a+b;
    }
    public static int sum1(int a, int b, int c){
        return a+b+c;
    }
    public static void main1(String[] args) {
        System.out.println(sum1(3,4));
        System.out.println(sum1(2,3,2));
    }


//overloading using data type

    public static int sum (int a, int b){
        return a+b;
    }
    public static float sum (float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
         System.out.println(sum(3,4));
         System.out.println(sum(2.2f,3.2f));
     }


    
}



