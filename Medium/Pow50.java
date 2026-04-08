package Medium;

public class Pow50 {
      public static double myPow(double x, int n) {
       
       double res=1;
       double  temp=n;
       while(temp<0){
        x=1/x;
        temp=-temp;        
       }
       for (int i = 0; i < temp; i++) {
          res=res*x;
       } 
    return res;
    }


    public static void main(String[] args) {
        System.out.println(myPow(2.10000, 3));
    }
}
