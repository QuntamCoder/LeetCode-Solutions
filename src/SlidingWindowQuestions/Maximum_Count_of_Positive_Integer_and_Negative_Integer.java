package SlidingWindowQuestions;

public class Maximum_Count_of_Positive_Integer_and_Negative_Integer {
    public static int maximumCount(int[] nums) {
        int negCnt=0,posCnt=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<0)
            negCnt++;
            else if (nums[i]>0) {
                posCnt++;
            }

        }
        return Math.max(negCnt, posCnt);
    }
    public static void main(String[] args) {
        int arr[]={-1,-2,-3,0,3,1,4,3};
        int res=maximumCount(arr);
        System.out.println(res);
    }
}
