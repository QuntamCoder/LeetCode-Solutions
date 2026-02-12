package Medium;

public class HouseRobber198 {
     public static int rob(int[] nums) {
        int sum=nums[0];
        for (int i = 0; i <nums.length; i++) {
            if(i%2!=0){
                sum+=nums[i];;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,1};
         System.out.println(rob(arr));
    }
}
