package ReviewJava;

public class ArrayElements{
    public static void main(String[] args) {
        C arr[] = new C[10];
        arr[0] = new C(1,2);
        System.out.println(arr[0].a);
        System.out.println(arr[0].b );
        C arr2[] = {new C(3,4),new C(5,6)};
        for(C c : arr2){
            System.out.println(c.a+"\t"+c.b);
        }

        DVD myMovies[] = new DVD[10];
        myMovies[0] = new DVD("Toy Story",1999,70,"Pixar");
        myMovies[1] = new DVD("Monsters Inc.",2001,80,"Pixar");
        System.out.println(myMovies[0].toString()+"\n"+myMovies[1].toString());
        System.out.println(myMovies[2]);

        int matrix[][][] = { { {1,2} , {4,5} } , { {2,3} , {5,6} } };
    }
}
class C{
    int a;
    int b;

    public C(int a, int b) {
        this.a = a;
        this.b = b;
    }
}
class DVD{
    String title;
    int year;
    int dur;
    String producer;

    public DVD(String title, int year, int dur, String producer) {
        this.title = title;
        this.year = year;
        this.dur = dur;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", dur=" + dur +
                ", producer='" + producer + '\'' +
                '}';
    }
}
