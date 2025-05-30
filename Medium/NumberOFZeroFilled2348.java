package Medium;

public class NumberOFZeroFilled2348 {
     public long zeroFilledSubarray(int[] nums) {
        long cnt=0,res=0;
        for (int i = 0; i < nums.length; i++) {
           if(nums[i]==0){
            cnt++;
            res+=cnt;
           }else{
            cnt=0;
           }
        }

        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,3,0,0,2,0,0,4,0};
        NumberOFZeroFilled2348 aa=new NumberOFZeroFilled2348();
        System.out.println(aa.zeroFilledSubarray(arr));
    }
}
