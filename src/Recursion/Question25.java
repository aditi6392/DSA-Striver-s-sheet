package Recursion;

import java.util.ArrayList;
import java.util.List;

//Print permutation of string/array ->Approach 1 with extra sc
public class Question25 {
    private static void func(int nums[],List<Integer>ds, List<List<Integer>> ans ,boolean []freq){
        if (ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                func(nums,ds,ans,freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    public static List<List<Integer>> permut(int []nums){
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        func(nums,ds,ans,freq);
        return ans;
    }

    public static void main(String[] args) {
        int []nums={1,2,3};
        List<List<Integer>> result=permut(nums);
        for (List<Integer> n:result)
        {
            System.out.print(n + "");
        }
    }
}
