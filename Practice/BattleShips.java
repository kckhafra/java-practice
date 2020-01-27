import java.util.Scanner;

public class BattleShips{
    public static void main(String[] args) {
        System.out.println("***Welcome to Battle Ships game*** \n \n Right now, the sea is empty.");
        deployShips();
    }

    public static void map(char[][] arr1) {
    System.out.println("   0123456789");
    for (int i = 0; i < arr1.length; i++) {
        System.out.print(i + " |");
        for (int j = 0; j < arr1[0].length; j++) {
            if (arr1[i][j] == 1) {
                System.out.print('@');
            } else if (arr1[i][j] == 2){
                System.out.print(' ');
            }else if (arr1[i][j] == 3){
                System.out.print('x');
            } else if (arr1[i][j] == 4){
                System.out.print('!');
            } else if (arr1[i][j] == '*'){
                System.out.print(' ');
            }else {
                System.out.print(arr1[i][j]);
            }
        }
        System.out.println("| " + i);
    }
    System.out.println("   0123456789");
}

    public static void deployShips(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X coordinate for your ship: ");
        int x = input.nextInt();
        System.out.print("Enter Y coordinate for your ship: ");
        int y = input.nextInt();
        System.out.print(x + " " + y);
    }
    
}


