package Medium;

public class TrailingZero{
      public static int trailingZeroes(int n) {
        if(n==0) return 0;
        int temp=0;
        while(n>0){             
            n=n/5;
            temp+=n;
        }
      
                return temp;
    }
    public static void main(String[] args) {
        int n=trailingZeroes(13);
        System.out.println(n);
    }
}