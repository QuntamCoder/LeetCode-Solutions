public class PlusOneProblem {

    public static int ReturnLastDigit(int arr[]){
        return arr[arr.length-1];

    }
    public static void main(String[] args) {
        int arr[]={1,2,9};
        int sum=ReturnLastDigit(arr);
        // System.out.println(sum);
        for (int i = arr.length-1; i >= 0; i--) {
            // System.out.println(arr[i]);
            if(arr[i]!=9){
                arr[i]=arr[i]+1;
                break;
            }else{
              arr[i-1]=arr[i]+1;
              arr[i]=0;
                
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);

        }
        

    }
}
