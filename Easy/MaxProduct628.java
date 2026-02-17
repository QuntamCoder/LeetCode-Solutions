package Easy;

import java.util.Arrays;

public class MaxProduct628 {
    public int maximumProduct(int[] nums) {
        if(nums.length<3){
            return 0;
        }
Arrays.sort(nums);
return  Math.max(nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1],nums[0]*nums[1]*nums[nums.length-1]);

    // int maxProduct=1;
    //     for (int i = 0; i < nums.length-1; i++) {
    //         for (int j = i+1; j < nums.length; j++) {
    //             if(nums[j]>nums[i]){
    //                 int temp=nums[j];
    //                 nums[j]=nums[i];
    //                 nums[i]=temp;
    //             }
    //         }
    //     }
    //    for (int i = 0; i < 3; i++) {
    //     maxProduct*=nums[i];
    //    }
    //     return maxProduct;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        MaxProduct628 aa=new MaxProduct628();
        int res=aa.maximumProduct(arr);
        System.out.println(res);

    }
}
