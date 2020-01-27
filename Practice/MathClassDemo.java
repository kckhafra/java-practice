public class MathClassDemo {
    public static void main(String[] args){
        //pythagorean theorem c = square root of (a^2 + b^2)
        int a = 5;
        int b = 10;
        double aSq = Math.pow(a,2);
        double bSq = Math.pow(b,2);
        double c = Math.sqrt(aSq + bSq);
        System.out.println("c = " + c);
    }
}