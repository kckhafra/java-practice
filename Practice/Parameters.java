

public class Parameters{
    public static void main(String[] args){
        int x = power2(2,7);
        System.out.println(x);
    }
    
   public static int power2(int base, int exp) {
    int result = 1 ;
    for (int i = 1; i <= exp; i++) {
        result *= base;
    }
    // System.out.println(base + " to the " + exp + " = " + result);
    return result; 
    }
}