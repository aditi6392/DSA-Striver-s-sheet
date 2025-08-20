package Recursion;

import java.util.ArrayList;
import java.util.List;
//print subsequence whose sum is equal to target

public class Question17 {
    public static void subsum(int index, int arr[], List<Integer> ds,int sum,int target){
        if(index>=arr.length){
            if (sum==target){
                System.out.println(ds);

            }
            return;
        }

        ds.add(arr[index]);
        sum+=arr[index];
        subsum(index+1,arr,ds,sum,target);
        //not pick
        ds.remove(ds.size()-1);
        sum-=arr[index];
        subsum(index+1,arr,ds,sum,target);
    }

    public static void main(String[] args) {
        int[] arr={1, 2, 1};
        subsum(0,arr,new ArrayList<>(),0,2);

    }
}
