public class Student {
     private String name;
     private int grad;
     private int ID;
     private double GPA;
     private int abs;

    //If you don't use this you must use different names for the values. 
    // public Student(String n,int g, int I, double gpa, int ab){
        
    //     this.name = n;
    //     this.grad = g;
    //     this.ID = I;
    //     this.GPA = gpa;
    //     this.abs = ab;
        
    // }

    //You can use the same fields name for your parameters and values if you use this. example this.name = name
     public Student(String name,int grad, int ID, double GPA, int abs){
        this.name = name;
        this.grad = grad;
        this.ID = ID;
        this.GPA = GPA;
        this.abs = abs;  
    }

    public Student(int grad){
         this("default",grad,000,3.0,0);
    }

    public boolean isGraduating() {
        System.out.print(name + " is ");
        return (GPA > 2.0 && abs < 10 && grad == 12);
    }
    

    public void printDetails(){
        System.out.println(name);
        System.out.println("Grade: " + grad);
        System.out.println("ID: " + ID);
        System.out.println("GPA: "+ GPA);
        System.out.println("Absents: " + abs);
    }

    public boolean equals(Student other) {
    return this.grad == other.grad;
    }
    public String getInfo() {
        return name + " " + grad + " $" + GPA;
    }
}

