package Easy;

import java.util.Arrays;

public class AverageSalary1491 {
   public double average(int[] salary) {
    Arrays.sort(salary);
    double cnt=0;
    double sum=0;

        for (int i = 1; i < salary.length-1; i++) {
          sum+=salary[i];
          cnt++;
        }
        
        
        return sum/cnt;
    } 
    public static void main(String[] args) {
         AverageSalary1491 aa= new AverageSalary1491();
         int arr[]={100,2000,3000,4000};
         System.out.println(aa.average(arr));

    }
}

