package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrimeBinary {
    public static int cntPrime(int l,int r){
        StringBuilder str=new StringBuilder();
        List<Integer> map=new ArrayList<>();
        for (int i = l; i <= r; i++) {
            str.append(Integer.toBinaryString(i));
            int cnt=0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)=='1') cnt++;
            }
            map.add(cnt);
            str.setLength(0);
        }
        int primeCnt=0;
        for (int itr : map) {
            Boolean flag=true;
            if(itr<2){
                flag=false;
            }
            for (int i = 2; i < itr; i++) {
                if(itr%i==0){
                 flag=false;
                }
            }
            if(flag){
                primeCnt++;
            }
        }
  return primeCnt;
    }
    public static int countPrimeSetBits(int left, int right) {
        StringBuilder str = new StringBuilder();
        int primeCnt = 0;
        for (int i = left; i <= right; i++) {
            int k = i;
            while (k > 0) {
                str.append(k % 2);
                k /= 2;
            }
            int cnt = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == '1')
                    cnt++;
            }
            boolean flag = true;
             if (cnt < 2)
                   flag= false;
            for (int j = 2; j < cnt; j++) {
                if (cnt % j == 0){
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                primeCnt++;
            }

            str.setLength(0);
        }

        return primeCnt;
    }

    public static void main(String[] args) {
        int left = 6;
        int right = 10;
        System.out.println(cntPrime(left, right));
    }
}
