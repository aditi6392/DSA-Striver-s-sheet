package Recursion;

import java.util.ArrayList;
import java.util.List;

// Combination Sum I
public class Question21 {

    private void findCombinations(int index, int arr[], int target, List<List<Integer>> ans, List<Integer> ds) {
        if (index == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // take the current element if it's <= target
        if (arr[index] <= target) {
            ds.add(arr[index]);
            findCombinations(index, arr, target - arr[index], ans, ds);  // stay at same index because element can be reused
            ds.remove(ds.size() - 1);  // backtrack
        }

        // move to next index (exclude current element)
        findCombinations(index + 1, arr, target, ans, ds);
    }

    public List<List<Integer>> combinationSum(int candidates[], int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {
        Question21 obj = new Question21();
        int arr[] = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = obj.combinationSum(arr, target);
        System.out.println(result); // should print [[2, 2, 3], [7]]
    }
}
