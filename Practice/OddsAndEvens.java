import java.util.Scanner;

public class OddsAndEvens {
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play a game called \"Odds and Evens\"");
        System.out.println("What is your name? ");
        String name = input.nextLine();
        System.out.println("Hello "+name + ". Which do you chose? (O)dds or (E)vens?");
        String choice = input.nextLine();
        if(choice.equals("O")||choice.equals("o") ){
            System.out.println( name + " has picked odds! The computer will be evens.");
        }else{
             System.out.println( name + " has picked evens! The computer will be odds.");
        }

         System.out.println("------------------------------------------------------");
        
    }
}