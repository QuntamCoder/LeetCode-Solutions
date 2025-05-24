package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargest1796 {
     public int secondHighest(String s) {
        ArrayList<Integer> res=new ArrayList<>();
        int i=0;
        for (int ii = 0; ii <s.length(); ii++) {
            char ch=s.charAt(ii);
            if(Character.isDigit(ch)){
                if (!res.contains(ch-'0')) {
                                    res.add(ch-'0');

                }
            }
        }
        System.out.println(i);
        if(res.size()<2) return -1;
        Collections.sort(res);
    
        int max=Integer.MIN_VALUE;
        int scndmax=max;
        for (int j:res) {

            if(j>max){
            scndmax=max;
            max=Math.max(j, max);
            }
        }
        if(scndmax==max){
            return -1;
        }else{
            return scndmax;
        }
    }
    public static void main(String[] args) {
        SecondLargest1796  aa=new SecondLargest1796();
        int res=aa.secondHighest("dfa12321afd");
        System.out.println(res);
    }
}
