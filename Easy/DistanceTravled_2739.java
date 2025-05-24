package Easy;

public class DistanceTravled_2739 {
    public static int distanceTraveled(int mainTank, int additionalTank) {
        int dist=0;
        int used=0;
        while(mainTank>0){
            mainTank--;
            dist+=10;
            used++;
            if(used==5 && additionalTank >0){
                mainTank+=1;
                additionalTank-=1;
                used=0;
            }
        }
     
      return dist;
    }
    public static void main(String[] args) {
        System.out.println(distanceTraveled(15, 2));
    }
}
