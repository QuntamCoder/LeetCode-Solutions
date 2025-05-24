package SlidingWindowQuestions;

import java.math.BigInteger;

public class PlusOne {

    public static void main(String arg[]){
        int arr[]={2,3,4,1,4,5};
        String num="";
        for (int i = 0; i < arr.length; i++) {
            num=num+arr[i];
        }
        BigInteger bigNum = new BigInteger(num);
        bigNum = bigNum.add(BigInteger.ONE);
        
        String num2 = bigNum.toString();
        String[] NumArray = num2.split("");
        
        int[] result = new int[NumArray.length];

        for (int i = 0; i < NumArray.length; i++) {
            result[i] = Integer.parseInt(NumArray[i]);
        }
        
    }
}
