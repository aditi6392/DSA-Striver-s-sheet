package SlidingWindowOrTwoPointer;
//Leetcode 1423
//Find maximum points we can obtain from ncards
//can pick only from front or last
public class Question1 {
    public static int func(int[] arr, int k) {
        int n = arr.length;
        int lsum = 0, rsum = 0;

        // take first k cards from the left
        for (int i = 0; i < k; i++) {
            lsum += arr[i];
        }
        int maxsum = lsum;
        int rindex=n-1;

        // now shift window: remove from left, add from right
        for (int i = k-1; i >=0; i--) {
            lsum -= arr[i];   // remove from left
            rsum += arr[rindex];// add from right
            rindex=rindex-1;
            maxsum = Math.max(maxsum, lsum + rsum);
        }

        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        System.out.println(func(arr, 4)); // expected 18
    }
}
