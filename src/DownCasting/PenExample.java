package DownCasting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class PenExample {
    public static void main(String[] args){
        List<Pen> arr = new ArrayList<>() ;
//        arr.add(new Pen());
//        arr.add(new Crayola());
//        arr.add(new Pen());
        arr.forEach(element -> {
            if (element instanceof Pen) {
                ((Crayola) element).write();
            } else {
                element.color();
            }
        });
    }
     class Pen {
        void color() {
            System.out.println("red");
        }
    }
     class Crayola extends Pen {
        void write() {
            System.out.println("smooth");
        }
    }
}

