package Easy;
public class BuddyString859 {
    public boolean buddyStrings(String s, String goal) {
        
                if(s.length()!=goal.length()){
                    return false;
                }
             if (goal==s) {
                       return true;

                }
                StringBuilder sb=new StringBuilder();
                for (int i = s.length()-1; i >=0; i--) {
                    sb.append(s.charAt(i));
                }
                if (goal.equals(sb.toString())) {
                       return true;

                }

                return false;
                
    }
    public static void main(String[] args) {
        BuddyString859 aa=new BuddyString859();
       aa.buddyStrings("ab", "ba");
    }
}
