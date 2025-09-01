package Array_And_BinarySearch;

//Given 1 index array , find two numbers index whose sum is equal to target in sorted array

import java.util.Arrays;

public class Question13 {
    public static int[] func(int []arr,int target) {
        int left =0;
        int right = arr.length - 1;
        int result[] = {-1, -1};
        while (left<right){

            if (arr[left]+arr[right]==target){
                result[0]=left+1;
                result[1]=right+1;
                return  result;
            }
            else if (arr[left]+arr[right]<target){
                left++;
            }
            else {
                right--;
            }

    }
        return result;

    }

    public static void main(String[] args) {
        int arr[]={1,2,4};
        int[] result = func(arr, 5);
        System.out.println(Arrays.toString(result));

    }
}
