package Medium;
public class TwoSumII167 {
    // public int[] twoSum(int[] numbers, int target) {
    //     int f=0,k=0;
    //     for (int i = 0; i < numbers.length; i++) {
    //         for (int j = i+1; j <numbers.length; j++) {
    //             if(numbers[i]+numbers[j]==target){
    //                 f=i;
    //                 k=j;
    //                 break;
    //             }
    //         }
    //     }
    //                 return new int[]{f+1,k+1};
    // }

    public int[] twoSum(int[] number, int target) {
        int f=0,l=number.length-1;
        while (f<l) {
            if(number[f]+number[l]<target){
          
                     f++;
            }else if(number[f]+number[l]>target){
                  l--;
            }else{
                return new int[]{f+1,l+1};
            }
        }
        return null;
        
    }
    public static void main(String[] args) {
        int arr[]={-1,0};
        int tar=-1;
        TwoSumII167 aa=new TwoSumII167();
        int res[]=aa.twoSum(arr, tar);
        for (int i : res) {
            System.out.println(i);
        }
    }
}
