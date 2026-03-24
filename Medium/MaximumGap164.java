package Medium;

import java.util.Arrays;

public class MaximumGap164{
        public static int maximumGap(int[] nums) {
        int max=0;
        Arrays.sort(nums);
        int i=0;
        for (int j = 1; j < nums.length; j++) {
            max=Math.max(max, nums[j]-nums[i++]);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={3};
        System.out.println(maximumGap(arr));
    }
}