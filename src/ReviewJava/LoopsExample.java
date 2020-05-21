package ReviewJava;

public class LoopsExample {
    public static void main(String[] args) {
        for (int i = 0, j=10;  i <10 && j>=0; i++, j++){
            System.out.println("i = "+i+ "\tj="+j);
        }
        for (int i = 0, j=10; i <j ; i++, j--){
            System.out.println("i = "+i+"\tj="+j);
        }
        StringBuilder word = new StringBuilder("java is fun");
        char temp;
        for (int i =0, j=word.length()-1;  i < j ; i++, j--){
            temp = word.charAt(i);
            word.setCharAt(i, word.charAt(j));
            word.setCharAt(j,temp);
        }
        System.out.println(word);
        int count =0;
        for(;;){
            if (count==5){
                break;
            }
            System.out.println("Hello");
            count++;
        }
        String arr[] = {"abc", "def",null, " "};
    }
}
