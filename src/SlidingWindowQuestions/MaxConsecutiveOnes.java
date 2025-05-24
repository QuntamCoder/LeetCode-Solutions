package SlidingWindowQuestions;

public class MaxConsecutiveOnes {
    public static boolean threeConsecutiveOdds(int[] nums) {
        int cnt=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]%2!=0){
                cnt++;
                if(cnt==3){
                    return true;
                }
            }else{
                cnt=0;
            }
        }
        return false;
    
    
    }
    public static int  countOnes(int[] nums){
    int cnt=0;
    int max=0;
    for (int i = 0; i < nums.length; i++) {
        if(nums[i]==1){
            cnt++;
            max=Math.max(max, cnt);
        }else{
            cnt=0;
        }
    }
    return max;

    }
    public static void main(String[] args) {
        int arr[]={1,0,1,1,1,0,1,1,1,1,1,1};
        int nus[]={2,4,6};

        System.out.println(threeConsecutiveOdds(nus));
    }
}
