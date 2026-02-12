package Easy;

public class ValidPerfectSquare{
        public static boolean iPerfectSquare(int num) {
        if(num<=0) return false;

          int temp=num%10;
          if(temp==2 || temp==3 || temp==7 || temp==8){
            return false;
          }else{
               return true;
          }
        }


        public static void main(String[] args) {
            System.out.println(iPerfectSquare(10));
        }

}