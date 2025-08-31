package Array_And_BinarySearch;

import java.util.Arrays;

//remove duplicate
public class Question3 {
    public static void duplicate(int []arr) {
         Arrays.sort(arr);
        for (int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                System.out.print(arr[i]+" ");
            }

        }

    }
    public static void main(String[] args) {
        int arr[]={1,2,1,3,7,5};
        duplicate(arr);
    }
}
