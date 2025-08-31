package Array_And_BinarySearch;
//Find index of target value in rotated sorted array
public class Question9 {
    public  static int func(int arr[],int target){
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==target) return mid;
            //Checking left part is sorted or not
            if (arr[left]<=arr[mid]){
                //Ensuring target lies in left part
                if (arr[left]<=target && target<=arr[mid]) right=mid-1;
                else left=mid+1;

            }
            //checking right part is sorted
            else {
                if (arr[right]>=target && target>=arr[mid]) left=mid+1;
                else right=mid-1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(func(arr,0));
    }
}
