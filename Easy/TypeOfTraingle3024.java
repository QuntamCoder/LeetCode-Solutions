package Easy;
public class TypeOfTraingle3024 {
    public String triangleType(int[] nums) {
        if(nums[0]+nums[1]<=nums[2]||nums[1]+nums[2]<=nums[0]||nums[0]+nums[2]<=nums[1]){
    return "none";
}

        if(nums[0]==nums[1]&&nums[1]==nums[2]){
            return "equilateral";
        }else if(nums[0]!=nums[1]&&nums[1]!=nums[2]&&nums[0]!=nums[2]){
            return "scalene";
        }else{
            return   "isosceles";
        }
    }
    public static void main(String args[]){
        TypeOfTraingle3024 aa=new TypeOfTraingle3024();
        String res=aa.triangleType(new int []{8,4,2});
        System.out.println(res);
    }
}
