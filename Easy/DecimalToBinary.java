package Easy;
public class DecimalToBinary {
    public static void DecTOBin(int num){
        StringBuilder str=new StringBuilder();
        while (num>0) {
            str.append(num%2);
            num=num/2;
        }
         for (int  i=0;i<str.length();i++) {
            if(str.charAt(i)=='1'){
                 str.setCharAt(i,'0');
            }else{
            str.setCharAt(i,'1');

            }
         }
         str=str.reverse();
         int power=1;
         int dec=0;
         for (int i =str.length()-1; i > 0; i--) {
            if(str.charAt(i)=='1'){
                dec += power;
            }
            power *=2;
         }

         System.out.println(dec);

    }
    public static void main(String[] args) {
        DecTOBin(2);
    }
}
