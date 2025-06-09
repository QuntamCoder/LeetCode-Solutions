package Easy;

import java.util.*;

public class DisapperedNumber448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list=new ArrayList<>();
          for (Integer integer : nums) {
            list.add(integer);
          }
        List<Integer> res=new  ArrayList<>();
        for (int i = 1; i <= list.size(); i++) {
            if(!list.contains(i)){
                res.add(i);
            }
        }

        return res;
    }
}
