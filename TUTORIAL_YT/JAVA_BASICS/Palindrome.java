package TUTORIAL_YT.JAVA_BASICS;
//To find out whether the given String is Palindrome or not.
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        String reversedStr = "";
        for(int i = str.length()-1; i>=0; i--){
            reversedStr += str.charAt(i);
        }
        if(str.equals(reversedStr)){
            System.out.println(str + " is a Palindrome.");
        } else {
            System.out.println(str + " is not a Palindrome.");
        }
    }
    
}
