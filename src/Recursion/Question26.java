package Recursion;

import java.util.ArrayList;
import java.util.List;

//Print all permutation of string/array - approach 2 with less sc
public class Question26 {
    private static void func(int index, int []nums, List<List<Integer>> ans){

        if (index==nums.length){
            List<Integer> ds=new ArrayList<>();
            for (int i=0;i<nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i=index;i<nums.length;i++){
            swap(i,index,nums);
            func(index+1,nums,ans);
            swap(i,index,nums);
        }
    }
    private static void swap(int i,int j,int []nums){
        int t=nums[i];
        nums[i]=nums[j];
         nums[j]=t;
    }
    public static List<List<Integer>> permute(int []nums){
        List<List<Integer>> ans=new ArrayList<>();
        func(0,nums,ans);
        return ans;
    }

    public static void main(String[] args) {
        int nums[]={1,3,2};
        List<List<Integer>> result=permute(nums);
        System.out.print(result);
    }
}
