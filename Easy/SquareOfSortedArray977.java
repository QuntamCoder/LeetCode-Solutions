package Easy;

import java.util.Arrays;

public class SquareOfSortedArray977 {
    public int[] sortedSquares(int[] nums) {
        // int[] res=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);

        // for (int i : res) {
        //     System.out.println(i);
        // }
        return nums;

    }
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};
        SquareOfSortedArray977 aa=new SquareOfSortedArray977();
        aa.sortedSquares(arr);
    }
}
