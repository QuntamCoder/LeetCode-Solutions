package Easy;

import java.util.ArrayList;
import java.util.List;

public class FindWordCharacter2942 {
    

public List<Integer> findWordsContaining(String[] words, char x) {
      List<Integer> res=new ArrayList<>();
    for (int i = 0; i < words.length; i++) {
        String word=words[i];
        for (char ch : word.toCharArray()) {
            if(ch==x){
                res.add(i);
                break;
            }
        }
    }
               return res;

    }

    public static void main(String[] args) {
        List<Integer> res=new  ArrayList<>();
        String arr[]={"amol","ashok","jadhav","bb"};
        FindWordCharacter2942 aa=new FindWordCharacter2942();
        res=aa.findWordsContaining(arr, 'a');
        for (Integer string : res) {
            System.out.println(string);
        }
    }

}
