public class SmllestElementOfTheArray {
    static int findSmallest(int arr[]){
        int min=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String args[]){
        int arr[]={3,3,7,6,1};
    System.out.println("smallest number of the given array is"+findSmallest(arr));
    }
}
