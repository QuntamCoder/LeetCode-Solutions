package SlidingWindowQuestions;

public class SignOfTheProduct_1822{
    public static int arraySign(int[] nums) {
        int cnt=0;
         for(int i:nums)
    {
        if(i==0){
            return 0;
        }
        if(i<0){
            cnt++;
        }
    }
    if(cnt%2!=0){
        return -1;
    }else{
        return 1;
    }
    }
public static void main(String[] args) {
    int arr[]={-1,1,-1,1,-1};
    System.out.println(arraySign(arr));
}
}