package Easy;

public class checkOnesSegment {
   public static boolean checkOneSeg(String str) {
        boolean flag = false;
        for (int i = 0; i < str.length()-1; i++) {
            char ch = str.charAt(i);
            char ch1 = str.charAt(i + 1);
            if (ch == '0' && ch1 == '1') {
                return false;
            } else {
                flag = true;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        System.out.println(checkOneSeg("11011"));
    }
}