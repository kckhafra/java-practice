public class Recursion{
    public static void main(String[] args){
        int x = factorial(4);
        System.out.println(x);
    }
//     public static int factorial(int n) {
//     int result = 1;
//     for (int i = 2; i <= n; i++) {
//         result *= i;
//     }
//     return result;
// }
    public static int factorial(int n) {
        System.out.println(n);
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
        
    }
}