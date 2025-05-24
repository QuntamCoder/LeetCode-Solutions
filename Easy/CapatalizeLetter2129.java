package Easy;

public class CapatalizeLetter2129 {
    public String capitalizeTitle(String title) {
        
        String arr[]=title.split(" ");
        StringBuilder sb=new StringBuilder();
        StringBuilder  s1=new StringBuilder();
        
        for (int i = 0; i < arr.length; i++) {
            String word=arr[i].toLowerCase();
            if(i!=arr.length-1){
            if(word.length()<3){
                sb.append(word+" ");
            }else{
               sb.append(word.toUpperCase().charAt(0));
                for (int j = 1; j < word.length(); j++) {
                   sb.append(word.charAt(j));
               } 
                              sb.append(" ");  
      
            }
        }else{
            if(word.length()<3){
                sb.append(word);
            }else{
               sb.append(word.toUpperCase().charAt(0));
               for (int j = 1; j < word.length(); j++) {
                   sb.append(word.charAt(j));
               }  
            }
        }

        }
        return sb.toString();
    }
public String capitalizeTitle1(String title) {
        String[] arr = title.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : arr) {
            word = word.toLowerCase();
            if (word.length() < 3) {
                sb.append(word);
            } else {
                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1));
            }
            sb.append(" ");
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        CapatalizeLetter2129 aa=new CapatalizeLetter2129();
        System.out.println(aa.capitalizeTitle("my name is amol"));
    }
}
