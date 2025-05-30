package Medium;

public class ProductOfArray238 {
    //not optimized solution
    // public int[] productExceptSelf(int[] nums) {
    //     int[] res=new int[nums.length];
    //     for (int i = 0; i < nums.length; i++) {
    //         int sum=1;
    //         for (int j = 0; j < nums.length; j++) {
    //             if(i==j){
    //                 continue;
    //             }else{
    //                 sum*=nums[j];
    //             }
    //         }
    //         res[i]=sum;
    //     }
    //     return res;
    // }

    public int[]  productExceptSelf(int[] nums){
        int[] pre=new int[nums.length];
        int[] post=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if(i==0)
                pre[i]=nums[i];
            else
                pre[i]=pre[i-1]*nums[i]; }
         for (int i = nums.length-1; i >=0; i--) {
            if(i==nums.length-1)
             post[i]=nums[i];
            else
              post[i]=post[i+1]*nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(i==0)
            nums[i]=1*post[i+1];
            else if(i==nums.length-1)
            nums[i]=pre[i-1]*1;
            else
            nums[i]=pre[i-1]*post[i+1];
        }
  
   return nums;
    }
    public static void main(String[] args) {
        ProductOfArray238 aa=new ProductOfArray238();
        int nums[]={-1,1,0,-3,3};
        int arr[]=aa.productExceptSelf(nums);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
