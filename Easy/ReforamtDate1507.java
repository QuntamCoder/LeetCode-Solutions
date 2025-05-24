package Easy;

import java.util.HashMap;

public class ReforamtDate1507 {
    public String reformatDate(String date) {
        String  arr[]=date.split(" ");
      StringBuilder sb=new StringBuilder();
      sb.append(arr[arr.length-1]+"-");
      HashMap<String,String> map=new HashMap<>();
      map.put("Jan","01");
      map.put("Feb","02");
      map.put("Mar","03");
      map.put("Apr","04");
      map.put("May","05");
      map.put("Jun","06");
      map.put("Jul","07");
      map.put("Aug","08");
      map.put("Sep","09");
      map.put( "Oct","10");
      map.put("Nov","11");
      map.put("Dec","12");
    
      String str=map.get(arr[1]);
      sb.append(str+"-");
      String day=arr[0].replaceAll("[a-zA-Z]","");;
      
      if(day.length()==1){
        sb.append("0"+day);
      }else{
        sb.append(day);
      }

return sb.toString();

    

    }
    public static void main(String[] args) {
      ReforamtDate1507 aa=new ReforamtDate1507();
      String str=aa.reformatDate("20th Oct 2052");
      System.out.println(str);
    }
}
