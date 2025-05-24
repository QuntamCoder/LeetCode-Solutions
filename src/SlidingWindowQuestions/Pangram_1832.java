package SlidingWindowQuestions;

import java.util.HashMap;
import java.util.HashSet;

public class Pangram_1832 {
    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> alpabets = new HashSet<>();
        if (sentence.length() < 26) {
            return false;
        }
        for (char ch : sentence.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                alpabets.add(ch);
            }
        }
        return alpabets.size() == 26;
    }

    public static boolean checkIfPangram1(String sentence) {
        if (sentence.length() < 26) {
            return false;
        }
        for (char i = 'a'; i <= 'z'; i++) {
            int isalpa = 0;
            for (char j : sentence.toCharArray()) {
                if (j != i) {
                    isalpa = 1;
                }
            }
            if (isalpa == 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram1(str));
    }
}
