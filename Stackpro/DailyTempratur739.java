package Stackpro;

public class DailyTempratur739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        boolean flag=false;
        for (int i = 0; i < temperatures.length; i++) {
            flag=false;
            int cnt=0;
            for (int j = i+1; j < temperatures.length; j++) {
                if(temperatures[j]>temperatures[i]){
                    cnt++;
                    flag=true;
                    break;
                }else{
                    cnt++;
                }
                
            }
            if (flag) {
                res[i]=cnt;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        DailyTempratur739 aa=new DailyTempratur739();
        int temp[]={30,40,50,60};
        int[] res=new  int[temp.length];
        res=aa.dailyTemperatures(temp);
        for (int i : res) {
        System.out.println(i);
        }
    }
}
