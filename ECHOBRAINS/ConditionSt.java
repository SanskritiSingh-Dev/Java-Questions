import java.util.Scanner;

public class ConditionSt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //multiplied number is even or odd
        System.out.println("Enter a number: ");
        int userNum = sc.nextInt();
        
        if(userNum %2 ==0){
            int finalNum = userNum*5;
            System.out.println("The number is even, hence multiplied number is: " + finalNum);
        }else{
            System.out.println("odd number, so no need to multiply");
        }

        System.out.println("---------------------------------------------");

        //check the time and print the appropriate message
        System.out.println("enter the time in 24hr format:");
        int time = sc.nextInt();
        if(time < 12){
            System.out.println("Good Morning");
        }
        else if(time <18){
            System.out.println("Good Afternoon");
        }
        else{
            System.out.println("Good Evening");
        }

        System.out.println("---------------------------------");

        //check the battery of the phone and print the appropriate message
        System.out.println("enter the battery of your phone");
        int battery = sc.nextInt();
        if(battery <=20){
            System.out.println("Please charge your phone");
        }
        else{
            System.out.println("Your phone is good to go");
        }

        System.out.println("------------------------------");

        //check the ticket number and print the appropriate message
        System.out.println("enter the ticket number: ");
        int ticketNum = sc.nextInt();
        int ticketNumForFirstSlot = 1002;
        String ticket = "havingTicket";
        if(ticketNum == ticketNumForFirstSlot && ticket.equals("havingTicket")){
            System.out.println("enjoy your movie. Thank you for booking 1st slot with us.");
        }
        else{
            System.out.println("oops!! Please check your ticket number and try again for next slot.");
        }

        System.out.println("--------------------------------------------------------");

        //check the temperature outside and print the appropriate message
        System.out.println("enter the temperature outside: ");
        double temp = sc.nextDouble();
        if(temp >=45){
            System.out.println("Oh god!! It's too hot outside. Please stay hydrated and avoid going out.");
        }

        System.out.println("-----------------------------------------------");

        //convert lowercase char to upper case char by using only if else statement
        System.out.println("enter a lowercase character: ");
        char lowercase = sc.next().charAt(0);
        if(lowercase >= 'a' && lowercase <= 'z'){
            char uppercase = (char)(lowercase - 'a' + 'A');
            System.out.println("The uppercase character is: " + uppercase);
        }
        else{
            System.out.println("Please enter a valid lowercase character.");
        }
    }
    sc.close();
}