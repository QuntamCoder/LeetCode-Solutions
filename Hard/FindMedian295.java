package Hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MedianFinder {

    public List<Integer> list;
    public MedianFinder() {
        list=new ArrayList<>();

    }
    
    public void addNum(int num) {
       list.add(num);

        
    }
    
    public double findMedian() {
        Collections.sort(list);
        if(list.size()%2==0){
          return (list.get(list.size()/2-1)+list.get(list.size()/2))/2.0;
        }else{
             
             return list.get(list.size()/2);
            
        }

    }
}

public class FindMedian295 {
    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();
             obj.addNum(1);
             obj.addNum(2);
            //  double param_2 = obj.findMedian();
              obj.addNum(3);
             double param_2 = obj.findMedian();


             System.out.println(param_2);
    }
    
}
