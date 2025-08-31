package Array_And_BinarySearch;

import java.util.Arrays;

//First and last indx of  target in sorted array
//optimized solution
public class Question8 {
    public static void func(int []arr,int target){
        int []result={-1,-1};
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==target){
                result[0]=mid;
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }
        low=0;
        high=arr.length-1;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]==target){
                result[1]=mid;
                low=mid+1;
            }
            else if (arr[mid]<target){
                low=mid+1;
            }
            else {
                high=mid-1;
            }

        }
        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int []arr={2};
        func(arr,2);
    }

}
