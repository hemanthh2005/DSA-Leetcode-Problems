package Recursion;
import java.util.*;

public class Subsets {
    List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {

        List<Integer> current=new ArrayList<>();
        return helper(nums, 0, current);

    }

    List<List<Integer>> helper(int[] nums,int index, List<Integer> current){

        if(index==nums.length){
            ans.add(new ArrayList<>(current));
            return ans;
        }

        current.add(nums[index]);

        helper(nums,index+1, current);

        current.removeLast();

        helper(nums,index+1, current);

        return ans;
    }

    public static void main(String[] args) {
        Subsets s=new Subsets();

        int [] nums={1,2};
        System.out.println(s.subsets(nums));
    }

}

