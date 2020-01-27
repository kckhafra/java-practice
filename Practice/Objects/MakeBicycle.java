public class MakeBicycle{
    public static void main(String[] args){
        Bicycle specificBike = new Bicycle("Giant","OCR-1",899.99,28,true,599.99);
        Bicycle sBike = new Bicycle("iant","OCR-1",999.99,28,true,599.99);
        Bicycle defaultBike = new Bicycle();
        Bicycle genericBike = new Bicycle("Love","Cruiser",250.00);
        
        // Bicycle defaultBik = new Bicycle();
        // Bicycle defaultBi = new Bicycle();
        specificBike.printDetails();
        System.out.println("****************************");
        genericBike.printDetails();
        System.out.println("****************************");
        defaultBike.printDetails();
        System.out.println(specificBike.equals(genericBike));
        System.out.println(specificBike.bikeCount);
        System.out.println(genericBike.totalSold);
    }
}