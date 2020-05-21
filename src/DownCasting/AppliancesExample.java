package DownCasting;

public class AppliancesExample{
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator("GE", "New");
        Appliances appliances = (Appliances) refrigerator;
        refrigerator.lookUp();
        appliances.read();
        System.out.println(refrigerator.brand);
        System.out.println(appliances.model);
    }
}
class Appliances {
    String model;

    public Appliances(String model) {
       this.model = model;
    }
    void read(){
        System.out.println("New");
    }
}
class Refrigerator extends Appliances{
    String brand;

    public Refrigerator(String model, String brand) {
        super(model);
        this.brand = brand;
    }

    void lookUp(){
        System.out.println("Super Good");
    }
}

