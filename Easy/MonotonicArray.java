public class MonotonicArray {
    public boolean isMonotonic(int[] nums) {
        boolean increasing=true;
        boolean decreasing=true;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]>nums[i-1]){
                decreasing=false;
            }
            if(nums[i]<nums[i-1]){
                increasing=false;
            }
        }
        return increasing || decreasing;
    }

    public static void main(String[] args) {
            MonotonicArray aa=new MonotonicArray();
            int arr[]={1,2,3,4,5};
            System.out.println(aa.isMonotonic(arr));
    }
}
