package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listOfLists = new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        for (int i : nums) {
            temp.add(i);
        }
        listOfLists.add(new ArrayList<>());
        listOfLists.add(temp);
        for (int li : nums) {
            listOfLists.add(Arrays.asList(li));
        }
        for (int i = 0; i < nums.length-1; i++) {
               for (int j = i+1; j < nums.length; j++) {
                  listOfLists.add(Arrays.asList(nums[i],nums[j]));
               }
        }


        return listOfLists;
    }
    public static void main(String[] args) {
        List<List<Integer>> ll= new ArrayList<>();
        Subsets78  aa=new Subsets78();
        int arr[]={1,2,3};
        ll=aa.subsets(arr);
        for(List<Integer> list:ll){
            for(Integer inner:list){
                System.out.println(inner+" ");
            }
            System.out.println();
        }
    }
}
