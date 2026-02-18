package Easy;

public class BinAlterNumBits693 {
    public boolean hasAlternatingBits(int n) {

        boolean flag = true;

        StringBuilder str = new StringBuilder();
        while (n > 0) {
            str.append(n % 2);
            n = n / 2;
        }
        str.reverse();

     
            for (int i = 0; i < str.length()-1; i ++) {
                if (str.charAt(i) == str.charAt(i + 1)) {
                    flag = false;
                }
            }
      
        
        return flag;

    }

    public static void main(String[] args) {
        BinAlterNumBits693 obj=new BinAlterNumBits693();
        System.out.println(obj.hasAlternatingBits(5));
    }
}
