public class CompanyStructure {
    public static void main(String[] args) {
        Employee kc = new Employee("KC", 55000);
        Employee AJ = new Employee("AJ", 55000);
        // kc.printDetails();
        // AJ.printDetails();
        System.out.println(kc.getManager());
    }
}