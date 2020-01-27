import java.util.Scanner;

public class Grades {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This program calculates your grade.");
        System.out.println("How many grades would you like to enter?");
        int numGrades = input.nextInt();
        int[] myGrades = new int[numGrades];
        for(int i=0; i<myGrades.length; i++){
            System.out.print("HW" + (i+1) + "score: ");
            myGrades[i] = input.nextInt();
            
        }
        int sum = 0;
        for(int i=0; i<myGrades.length; i++){
            sum += myGrades[i];
        }
        int avg = sum/myGrades.length;
        int aboveAvg = 0;
        for (int i=0; i<myGrades.length; i++){
            if(myGrades[i]>avg){
                aboveAvg++;
            }
        }
    System.out.println("Average score = " + avg);
    System.out.println(aboveAvg + " Hw were above your average");
    }
    
}