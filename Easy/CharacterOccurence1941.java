package Easy;

import java.util.HashMap;
import java.util.Map;

public class CharacterOccurence1941 {
        public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
      
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }
        int newres=map.get(s.charAt(0));
        int preres=0;
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
               preres=entry.getValue();
               if(newres!=preres){
                return false;
               }
        }
        return true;
    }
    public static void main(String[] args) {
        CharacterOccurence1941 aa=new CharacterOccurence1941();
        System.out.println(aa.areOccurrencesEqual("aaabb"));
    }
}
