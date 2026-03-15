package Hard;

import java.util.ArrayList;
import java.util.List;

public class Fancy {
 List<Integer> list;
  public Fancy() {
        list=new ArrayList<>();
    }
    
    public void append(int val) {
        list.add(val);
    }
    
    public void addAll(int inc) {
        for (int i = 0; i < list.size(); i++) {
           list.set(i, list.get(i) + inc);
        }
    }
    
    public void multAll(int m) {
        for (int i = 0; i < list.size(); i++) {
             list.set(i, list.get(i) * m);
        }
    }
    
    public int getIndex(int idx) {
        return list.get(idx);
    }


    public static void main(String[] args) {
       Fancy fancy = new Fancy();
fancy.append(2);   // fancy sequence: [2]
fancy.addAll(3);   // fancy sequence: [2+3] -> [5]
fancy.append(7);   // fancy sequence: [5, 7]
fancy.multAll(2);  // fancy sequence: [5*2, 7*2] -> [10, 14]
fancy.getIndex(0); // return 10
fancy.addAll(3);   // fancy sequence: [10+3, 14+3] -> [13, 17]
fancy.append(10);  // fancy sequence: [13, 17, 10]
fancy.multAll(2);  // fancy sequence: [13*2, 17*2, 10*2] -> [26, 34, 20]
fancy.getIndex(0); // return 26
fancy.getIndex(1); // return 34
fancy.getIndex(2); // return 20
 
}
}