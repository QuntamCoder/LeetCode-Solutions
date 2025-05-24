package Easy;

public class DelayTime2651 {
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int delay=0;
        if(arrivalTime+delayedTime==24){
            return 0;
        }
        if (arrivalTime+delayedTime>24) {
            return arrivalTime+delayedTime-24;
        }
        return arrivalTime+delayedTime;

    }
    public static void main(String[] args) {
        System.out.println(findDelayedArrivalTime(1, 24));
    }
}
