package Easy;

public class MergeString1768 {
    public String mergeAlternately(String word1, String word2) {
        char arr1[]=word1.toCharArray();
        char arr2[]=word2.toCharArray();
        int i=0, j=0;
        StringBuilder sb=new StringBuilder();
        while (i<arr1.length&&j<arr2.length) {
            sb.append(arr1[i]);
            sb.append(arr2[j]);
            i++;
            j++;
        }
        if(j<arr2.length){
          while (j<arr2.length) {
               sb.append(arr2[j++]);
          }
        }
       if(i<arr1.length){
          while (i<arr1.length) {
               sb.append(arr1[i++]);
          }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        MergeString1768 aa=new MergeString1768();
        String res=aa.mergeAlternately("ab", "pqrs");
        System.out.println(res);
    }
}
