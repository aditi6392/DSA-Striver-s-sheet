package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Question19 {
    public static void merge_sort(int arr[],int low,int high){
            if (low>=high) return;
            int mid=(high+low)/2;
            merge_sort(arr,low,mid);
            merge_sort(arr,mid+1,high);
            merge(arr,low,mid,high);

    }
    public static void merge(int arr[],int low,int mid,int high){
        List<Integer> temp=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while (left<=mid && right<=high){
            if (arr[left]<arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        while (right<=high){
            temp.add(arr[right]);
            right++;
        }
        for (int i=low;i<=high;i++){
            arr[i] = temp.get(i - low);
        }
    }

    public static void main(String[] args) {
        int arr[]={3,2,4,1,3};
        merge_sort(arr,0,4);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
