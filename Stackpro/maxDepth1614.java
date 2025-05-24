package Stackpro;
public class maxDepth1614 {
    public int maxDepth(String s) {
       int dep=0;
       int maxdep=0;
        for (Character  str : s.toCharArray()) {
            if(str.equals('(')){
                dep+=1;
                maxdep=Math.max(maxdep, dep);
            
            }else if (str.equals(')')) {
                dep-=1;
            }
        }
        return maxdep;
    }
    public static void main(String[] args) {
        maxDepth1614 aa=new maxDepth1614();
        System.out.println(aa.maxDepth("(1)+((2))+(((3))))"));
    }
}
