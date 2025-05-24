package Medium;
public class FindPeak162 {
    public int findPeakElement(int[] nums) {
        int ind=0;
        boolean  flag=false;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i+1]<nums[i]){
              ind=i;
              flag=true;
              break;
            }
        }
        if(flag){
            return ind;
        }else{
            return nums.length-1;
        }

       
    }
    public static void main(String[] args) {
        FindPeak162 aa=new FindPeak162();
        int arr[]={1,2,3,1};
        System.out.println(aa.findPeakElement(arr));
    }
}
