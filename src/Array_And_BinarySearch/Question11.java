package Array_And_BinarySearch;
//Given the array nums after the rotation and an integer target,
// return true if target is in nums, or false if it is not in nums.

public class Question11 {
    public static boolean func(int []arr,int target){
        int left=0;
        int right=arr.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (arr[mid]==target) return true;
          if(arr[left]==arr[mid] && arr[mid]==arr[right]) {
              left++;
              right--;
              continue;
          }
            else if (arr[left]<=arr[mid]){
                if (arr[left]<=target && target<=arr[mid]) right=mid-1;

                else left=mid+1;
            }
            else {
                if (arr[right]>=target && target>=arr[mid]) left=mid+1;
                else right=mid-1;
            }

        }
        return false;

    }

    public static void main(String[] args) {
        int arr[]={2,5,6,0,1,2};





        System.out.println(func(arr,1));
    }
}
