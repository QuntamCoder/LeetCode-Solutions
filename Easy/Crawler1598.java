package Easy;

public class Crawler1598 {
    public int minOperations(String[] logs) {
        int depth=0;
        for (String str : logs) {
            if(str.equals("../")){
                if (depth>0)
                     depth-=1;

            }else if(str.equals("./")){
                continue;
            }else{
                depth+=1;
            }
        }
        return depth;
    }

}
