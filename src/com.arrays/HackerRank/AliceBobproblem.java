package HackerRank;

public class AliceBobproblem {
    public static void main(String[] args) {
        int aliceArray[]={1,2,3};
        int bobArray[]={3,2,1};
        int[] compare=new int[2];
        for (int i = 0; i < bobArray.length; i++) {
            if (aliceArray[i]>bobArray[i]) {
                compare[0]+=1;
            }else if (aliceArray[i]>bobArray[i]) {
                        compare[1]+=1;

                
            }else if (aliceArray[i]==bobArray[i]) {
                continue;
            }
        }
        for(int i:compare){
            System.out.print(i);
        }
    }
}
