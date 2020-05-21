package Nested;

public class NestedClass{
    public static void main(String[] args) {
       Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

    }
}
class Outer{
    void outer(){
        System.out.println("Beautiful House");
    }
    class Inner{
        void inner(){
            System.out.println("There are several rooms in the house");
        }
    }
}
