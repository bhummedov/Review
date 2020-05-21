package Nested;

public class HouseNestedClass{
    public static void main(String[] args) {
        House myHouse = new House("1100 W. Airport",5);
        House.Room myRoom = myHouse.new Room(100);
        System.out.println(myRoom instanceof House.Room);
        myHouse.warmUp();
        myHouse.turnLightOn();
        myRoom.openDoor();
        myRoom.closeDoor();
    }
}
class House{
    String address;
    int rooms;
    public House(String address, int rooms) {
        this.address = address;
        this.rooms = rooms;
    }
    void turnLightOn(){
        System.out.println("Lights On");
    }
    void coolDown(){
        System.out.println("House is cooling down");
    }
    void warmUp(){
        System.out.println("House is warming up");
    }

    class  Room{
        double size;

        public Room(double size) {
            this.size = size;
        }
        void openDoor(){
            System.out.println("Door opened");
        }
        void closeDoor(){
            System.out.println("Door closed");
        }
    }
}


