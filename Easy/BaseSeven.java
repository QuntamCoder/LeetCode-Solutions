package Easy;
public class BaseSeven {
    
    public static  String convertToBase7(int num) {
          StringBuilder str=new StringBuilder();
        while (num>0) {
            str.append(num%7);
            num=num/7;
        }

        return new String(str.reverse());
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
    }
}
