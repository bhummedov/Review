package JavaReview;

public class TestRemoveDublicates{
    public static void main(String[] args) {
        String sentence = "I have a job I enjoy and it pays well";
        sentence = RemoveVowelsDublicates.removeDuplicates(sentence);
        sentence = RemoveVowelsDublicates.removeSpaces(sentence);
        sentence = RemoveVowelsDublicates.removeVowels(sentence);
        System.out.println(sentence.toUpperCase());
    }
}
