package JavaReview;

import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class FindSameVowels {
    public static void main(String[] args) {
        String sentence[] = {"toe", "ocelot", "care", "race", "india"};
        printSameVowels(sentence);
    }

    public static boolean hasSameVowels(String first, String second) {
        String vowels = "aeoui";
        HashSet<String> hsFirst = new HashSet<>();
        HashSet<String> hsSecond = new HashSet<>();
        for (int i = 0; i < first.length(); i++) {
            if (vowels.contains(first.substring(i, i + 1))) {
                hsFirst.add(first.substring(i, i + 1));
            }
        }
        for (int i = 0; i < second.length(); i++) {
            if (vowels.contains(second.substring(i, i + 1))) {
                hsSecond.add(second.substring(i, i + 1));
            }
        }
        if (hsFirst.equals(hsSecond)) {
            return true;
        } else {
            return false;
        }
    }

    public static void printSameVowels(String arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (hasSameVowels(arr[i], arr[j])) {
                    System.out.println(arr[i] + "\t" + arr[j]);
                }
            }
        }
    }
}
