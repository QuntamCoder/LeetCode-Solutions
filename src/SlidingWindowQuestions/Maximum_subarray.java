package SlidingWindowQuestions;

public class Maximum_subarray {
    public static int maxSum(int arr[],int len){
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
           int cursum=0; 
            for (int j = i; j < arr.length; j++) {
                cursum+=arr[j];
                maxsum=Math.max(maxsum, cursum);
                
            }
        }
        return maxsum;
    }
    public static void main(String[] args) {

        int array[]={5,4,-1,7,8};
        int l=array.length;
        int res=maxSum(array,l);
        System.out.println(res);
    }
}
