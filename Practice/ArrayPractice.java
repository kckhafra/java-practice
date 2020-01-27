import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        char letters[] = new char[5];
        store();
        
        // for(int i=0; i<letters.length; i++){
        //     letters[i] = i
        // }
        // for(int i=0; i<letters.length; i++){
        //     System.out.println(letters[i]);
        // }

        
        
    }
     public static int store (){
            int[] x = new int[3];
            x[0] = 1;
            x[1] = 2;
            int[] y = x;
            y[2] = 3;
            System.out.println(x[0]);
            System.out.println(x[1]);
            System.out.println(x[2]);
            return x[0];
        }
    
}