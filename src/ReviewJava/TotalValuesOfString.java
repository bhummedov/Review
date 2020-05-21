package ReviewJava;

public class TotalValuesOfString {
    public static void main(String[] args) {
//        public static void findTotalValueOfTheString(){
//        String a="0";
//        char b=a.charAt(0);
//        for(int i=0; i<a.length();i++){
//            b++;
//            System.out.println(i+b);
//        }
//    }
//}
        findTotalValueOfTheString();
    }
        public static void findTotalValueOfTheString(){
            String a = "ABC";
            char b = a.charAt(0);
            for (int i = 0; i < a.length(); i++) {
                b++;
                System.out.println(i + b);
            }
        }
    }