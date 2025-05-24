package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinimumOperation2869 {
   public static int minOperations(List<Integer> nums, int k) {
        int cnt=0;
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= k; i++) {
            set.add(i);
        }
        for (int i = nums.size()-1; i >=0; i--) {
            cnt++;
            if(set.contains(nums.get(i))){
                set.remove(nums.get(i));
                if(set.isEmpty()){
                    break;
                }
            }
        }
        return cnt;
    } 
    public static void main(String[] args) {
        List<Integer> arr=new ArrayList<>();
        arr.add(3);
        arr.add(1);
        arr.add(5);
        arr.add(4);
        arr.add(2);
        System.out.println(minOperations(arr, 2));

    }
}
