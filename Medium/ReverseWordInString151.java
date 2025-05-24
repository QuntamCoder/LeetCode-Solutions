package Medium;

import java.util.Stack;

public class ReverseWordInString151 {
     public String reverseWords(String s) {
                String arr[]=s.split(" ");
        StringBuilder sb=new StringBuilder();
        for (int i= arr.length-1;i>=0; i--) {
            if (i==0) {
            sb.append(arr[i]);

            }
            else{
          sb.append(arr[i]+" ");

            }
        }
        
        return sb.toString();

     }
   public static void main(String[] args) {
    ReverseWordInString151 aa=new ReverseWordInString151();
    String str=aa.reverseWords(" amol jadhav ");
    System.out.println(str);

   }
}
