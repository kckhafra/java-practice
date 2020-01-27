public class Bird extends Animal {
    public Bird(int number,String string) {
        super(number,string);
    }
    private boolean flightless;
    
    public String soar() {
           return ("soar");
    }

    // public void fly() {
    //     if (!flightless) {
    //         soar();
    //     }
    // }

    // public String fly() {
    //     return super.fly();    
    // }
}