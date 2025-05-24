package Stackpro;

import java.util.HashSet;

public class RemoveDuplicate_216 {
    public static String removeDuplicateLetters(String s) {
        HashSet<Character> str=new HashSet<>();
        StringBuilder st=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(!str.contains(ch)){
                str.add(ch);
                st.append(ch);
            }
        }
   return st.toString();
    }
    public static void main(String[] args) {
       System.out.println(removeDuplicateLetters("cbacdcbc")); 
    }
}
