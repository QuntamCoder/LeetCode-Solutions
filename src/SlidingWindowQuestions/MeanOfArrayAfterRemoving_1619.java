
package SlidingWindowQuestions;

import java.util.Arrays;

public class MeanOfArrayAfterRemoving_1619{
        public static double trimMean(int[] arr) {
        Arrays.sort(arr);
        int len=arr.length;
        double limit=0.05*len;
        int st=(int) limit;
        int end=len-(int) limit;
        double sum=0,nlen=0;
        for(int i=st;i<end;i++){
            sum+=arr[i];
            nlen++;
        }
        double avg=sum/nlen;
        return avg;
    }
    public static void main(String[] args) {
    int arr[]={6,0,7,0,7,5,7,8,3,4,0,7,8,1,6,8,1,1,2,4,8,1,9,5,4,3,8,5,10,8,6,6,1,0,6,10,8,2,3,4};
    System.out.println(trimMean(arr));

    }

}