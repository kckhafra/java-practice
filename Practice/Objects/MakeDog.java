public class MakeDog{
    public static void main(String[] args){
        Dog a = new Dog();
        Dog b = new Sporting();
        Sporting c = new LabradorRetriever();

        System.out.println(a.bark()); // prints "woof"
        System.out.println(b.bark()); // prints "howl"
        System.out.println(c.bark()); // prints "high howl"
    }
}