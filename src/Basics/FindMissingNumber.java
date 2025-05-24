public class FindMissingNumber {
    static void findMissing(int arr[],int len){
        int sum=0,sum1=0;
           for (int i = 1; i < len-1; i++) {
                 sum+=i;  
        }
        System.out.println(sum); 

        for (int i = 1; i < len-1; i++) {
            sum1+=arr[i];   
   }
   System.out.println(sum1);

   System.out.println(sum1-sum);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,6,7};
        int len=7;
        findMissing(arr, len);
    }
}
