package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// subset sum 2 (Unique Subsets)
public class Question24 {

    public static void subset(int ind, int nums[], List<Integer> ds, List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));
        for(int i = ind; i < nums.length; i++){
            if(i != ind && nums[i] == nums[i-1]) continue; // skip duplicates
            ds.add(nums[i]);
            subset(i + 1, nums, ds, ansList);
            ds.remove(ds.size()-1);
        }
    }

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); // sort to handle duplicates
        List<List<Integer>> ansList = new ArrayList<>();
        subset(0, nums, new ArrayList<>(), ansList);
        return ansList;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2};
        List<List<Integer>> result = subsetsWithDup(nums);

        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}
