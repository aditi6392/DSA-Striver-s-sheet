package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//combination sum 2
public class Question22 {
    private static void CombinationSum(int index, int arr[], int target, List<List<Integer>> ans,List<Integer> ds){
        if (target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i=index;i<= arr.length-1;i++){
            if (i>index && arr[i]==arr[i-1]) continue;
            if (arr[i]>target) break;
            ds.add(arr[i]);
            CombinationSum(i+1,arr,target-arr[i],ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    public static List<List<Integer>> Combination2sum(int []candidates,int target){
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        CombinationSum(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,1,1,2,2};
       List<List<Integer>> result=Combination2sum(arr,4);
        for (List<Integer> comb : result) {
            System.out.println(comb);
        }
    }
}
