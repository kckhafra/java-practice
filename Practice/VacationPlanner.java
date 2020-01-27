import java.util.Scanner;

public class VacationPlanner {
    public static void main (String[] args) {
        greeting();
        travelTime();
        
    }

    public static void greeting (){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you traveling to? ");
        String cityName = input.nextLine();
        System.out.print("Great! " + cityName + " sounds like a great trip\n");
    }

     public static void travelTime (){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend traveling? ");
        int days = input.nextInt();
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        int money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currencySymbol = input.next();
        System.out.print("\n");
        System.out.print("\n");

        System.out.println("If you are traveling for " + days + " days, that is " + hours + " hours and " + minutes + " minutes" );

    }
    
}