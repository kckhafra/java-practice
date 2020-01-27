public class Bicycle {
    private String brand;
    private String model;
    private double price;
    private int tireSize;
    private boolean isSold;
    private double salePrice;
    public static int bikeCount;
    public static int totalSold;

    public Bicycle (String brand, String model, double price, int tireSize, boolean isSold, double salePrice) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.tireSize = tireSize;
        this.isSold = isSold;
        this.salePrice = salePrice;
        bikeCount++;
        if(isSold==true){
            totalSold++;
        }
    }

    public Bicycle(String brand, String model, double listPrice) {
        this(brand, model, listPrice, 28, false, listPrice);
    }

    public Bicycle() {
        this("brand", "model", 0.0, 28, false, 0.0);
    }

    public void printDetails(){
        System.out.println("Brand " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Sold: "+ isSold);
        System.out.println("SalePrice: " + salePrice);
    }
    private boolean equals(Bicycle other) {
        return this.brand.equals(other.brand);
    }

    // returns a String with basic information about
    // the bicycle
    public String getInfo() {
        return brand + " " + model + " $" + price;
    }
}