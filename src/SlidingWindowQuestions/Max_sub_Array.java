package SlidingWindowQuestions;

public class Max_sub_Array {
    public static int maxSum(int arr[],int k,int len){
        int sum=0;
         for (int i = 0; i < k; i++) {
              sum+=arr[i];
         }
         int maxSum=sum;
         for (int i = k; i < len; i++) {
               sum+=arr[i]-arr[i-k];
               maxSum=Math.max(maxSum, sum);
         }
         return maxSum;
    }
    public static void main(String args[]){
        int array[]={1,2,4,5,6,7};
        int windowSize=3;
        int l=array.length;
        int res=maxSum(array,windowSize,l);
        System.out.println(res);
       }
}
