package DownCasting;

public class InstanceOfExample {
    public static void main(String[] args) {
        GardenTool a = new GardenTool();
        if (a instanceof GardenTool){
            System.out.println("Belongs to GardenTool");
        }
        GardenTool b = new lawnMover();
        if (b instanceof GardenTool){
            System.out.println("Belongs to GardenTool");
        }
        lawnMover c = new lawnMover();
        System.out.println("Belongs to GardenTool");

    }
}
class GardenTool{
    void start(){
        System.out.println("started");
    }
}
class lawnMover extends GardenTool{
    void move(){
        System.out.println("cut cut cut");
    }
}