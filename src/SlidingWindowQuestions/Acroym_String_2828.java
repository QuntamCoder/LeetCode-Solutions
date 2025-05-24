package SlidingWindowQuestions;

import java.util.ArrayList;
import java.util.List;

public class Acroym_String_2828 {
    public static boolean isAcronym(List<String> words, String s) {
        if(words.size()!=s.length()){
            return false;
        }
        StringBuilder acm=new StringBuilder();
        for(String ch:words){
            acm.append(ch.charAt(0));
        }
        System.out.println(acm);
        return acm.toString().equals(s);
    }
    public static void main(String[] args) {
       // ["alice","bob","charlie"]
       List<String> ss=new ArrayList<>();
       ss.add("alice");
       ss.add("bob");
       ss.add("charlie");

       String str="ab";
       boolean aa= isAcronym(ss, str);
       System.out.println(aa);

    }
}
