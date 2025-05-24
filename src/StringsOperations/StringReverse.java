package StringsOperations;

public class StringReverse {
    static void reverseString(String str){
        char arr[]=str.toCharArray();
        for (int i =  arr.length-1; i >=0; i--) {
            System.out.print(arr[i]);
        }
    }
    static void reverseStringByCharAt(String str){
         for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
         }
    }
    static void reversStringUsingStringBuffer(String str){
        StringBuffer str1=new StringBuffer(str);
        System.out.println(str1.reverse());
    }
    public static void main(String args[]){
        String str="hello";
        reverseString(str);
        System.out.println();
        reverseStringByCharAt(str);
        System.out.println();
        reversStringUsingStringBuffer(str);
    }
}
