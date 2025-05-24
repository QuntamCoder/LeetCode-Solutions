package SlidingWindowQuestions;

import java.util.ArrayList;


public class FindTheDifference_389 {
    public static char findTheDifference(String s, String t) {
        ArrayList<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            list.add(c);
        }

        for (char c : t.toCharArray()) {
            if (list.contains(c)) {
                list.remove((Character) c); 
            } else {
                return c; 
            }
        }

        return '\0';
    }
public static void main(String[] args) {
    System.out.println(findTheDifference("abde", "abcde"));
}
}
