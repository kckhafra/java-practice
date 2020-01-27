public class ModuleProject{
    public static void main(String[] args){
        // String s = normalizeText("aaa");
        // String x = caesarify(-1,s);
        // System.out.println(x);
        System.out.println(groupify("heyhey", 2));

    }

    public static String normalizeText(String instring){
        String normalizeText = instring.replaceAll("[^a-zA-Z ]", "").toUpperCase().replaceAll("\\s+","");
        return normalizeText;
    }

    public static String groupify(String text, int n) {
    String result = "";
    while (text.length()%n != 0) {
        text = text + "x";
    }
    for (int i = 0; i < text.length(); i++) {
        String letter = text.charAt(i);
        System.out.println(letter);
        if(i > 0 && i%n == 0) {
            result = result + " " + (char) letter;
        } else {
            result = result + (char) letter;
        }
    }
    return result;
}


    public static String caesarify(int shift, String string) {
        String shiftedLetter = "";
        for (int i=0; i<string.length(); i++){
            char ch = string.charAt(i);
            int n = (int) ch + shift;
            char d = (char) n;
            
            if (n>90){
                 
                n= (char) (n-26 );
                d = (char) n;
                shiftedLetter +=d;
            }
            else if (n<65){
                n= (char) (n+26 );
                d = (char) n;
                shiftedLetter +=d;
            }
            else{
                shiftedLetter +=d;
            }
            
       
            
            
            
        }
        return shiftedLetter;
   
}

    
    

}