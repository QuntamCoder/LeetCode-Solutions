package Easy;

import java.util.HashSet;

public class RemoveDuplicate26 {
        public int removeDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        return set.size();
    }
    public static void main(String[] args) {
        RemoveDuplicate26 aa=new RemoveDuplicate26();
        int arr[]={0,0,1,1,1,2,2,3,3,4};
        System.out.println(aa.removeDuplicates(arr));
    }

}
