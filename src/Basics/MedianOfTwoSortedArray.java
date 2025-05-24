public class MedianOfTwoSortedArray {

    public double findSortedArray(int arr1[],int arr2[]){
        int m=arr1.length;
        int n=arr1.length;
        int arr3[]=new int[m+n];
        int i=0,j=0,k=0;
       while(i<m&&j<n){
        if(arr1[i]<arr2[j]){
            arr3[k]=arr1[i];
        }else{
            arr3[k]=arr1[j];

        }
        k++;
       }
       while(i<m){
        arr3[k]=arr1[i];
        i++;
        k++;
       }
       while(j<n){
        arr3[k]=arr2[j];
        j++;
        k++;
       }
       for (int l : arr3) {
        System.out.println(l);
       }
       return (Double) null;
    }

    public static void main(String args[]){
        int num1[]={2,5,7};
        int num2[]={3,4,5,6};
        MedianOfTwoSortedArray aa=new MedianOfTwoSortedArray();
        aa.findSortedArray(num1,num2); 
    }
}
