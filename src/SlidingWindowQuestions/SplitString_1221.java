package SlidingWindowQuestions;

public class SplitString_1221 {

    public  static int balancedStringSplit(String s) {
        int cnt=0,L=0,R=0;
        if(s.length()==0)
             return 0;
        for (int i = 0; i <s.length(); i++) {
            char ch=s.charAt(i);
            if(ch=='L'){
                L++;
            }else{
                R++;
            }
            if(R==L){
                cnt++;
            }
        }
      return cnt;
    }
    public static void main(String[] args) {
        
    }
}
