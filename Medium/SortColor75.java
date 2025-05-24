package Medium;

public class SortColor75 {
    public  void bubbleSort(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(nums[i]);
        }
    }

    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0;
        for (int i:nums) {
            if(i==0){
                zero++;
            }else if(i==1){
                one++;
            }else{
                two++;
            }
        }
        int cnt=0;
        for(int i=0;i<zero;i++){
            nums[cnt++]=0;
        }
        for(int i=cnt;i<zero+one;i++){
            nums[cnt++]=1;
        }
        for(int i=cnt;i<zero+one+two;i++){
            nums[cnt++]=2;
        }
        for (int i = 0; i < cnt; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        SortColor75 aa=new SortColor75();
        int arr[]={2,0,2,1,1,0};
        aa.sortColors(arr);
        aa.bubbleSort(arr);
    }
}
