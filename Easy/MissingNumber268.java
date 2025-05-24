package Easy;

import java.util.Arrays;

public class MissingNumber268 {
     public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if(i!=nums[i]){
                return i;
            }
        }
        return 0;

    }
    public static void main(String[] args) {
        MissingNumber268 aa=new MissingNumber268();
        int arr[]={0,1};
        System.out.println(aa.missingNumber(arr));
    }

}
