package Medium;

import java.util.HashMap;

public class FindDuplicate287 {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        for (int i = 0; i < nums.length; i++) {
            int n=map.get(nums[i]);
            if(n>1){
                return nums[i];
            }
        }
            return 0;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6};
        FindDuplicate287 aa=new FindDuplicate287();
        System.out.println(aa.findDuplicate(arr));
    }
}

