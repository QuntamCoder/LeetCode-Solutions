package Easy;
public class AdditiveNumber306 {
    public static boolean isAdditiveNumber(String num) {
       boolean flag=false;

       if(num.length()<2){
        return false;
       }

       int j=0;
       for (int i =1; i < num.length()-1; i++) {
           if((num.charAt(j++)-'0')+(num.charAt(i)-'0')==(num.charAt(i+1)-'0')){
             flag=true;
           }
       }

       
        return flag;
    }

    public static void main(String[] args) {
        String str="11235";
        System.out.println(isAdditiveNumber(str));
    }
}
