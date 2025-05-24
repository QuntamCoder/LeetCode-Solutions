package SlidingWindowQuestions;

public class RevereString_344{
    public static void reverseString(char[] s) {
        int start=0;
        int end=s.length-1;
        while (start<end) {
            char ch=s[start];
            s[start]=s[end];
            s[end]=ch;
            start++;
            end--; 
        }
        for(char ch:s){
            System.out.print(ch);
        }
    }
    public static void main(String[] args) {
        char arr[]={'a','m','o','l'};
        reverseString(arr);

    }
}