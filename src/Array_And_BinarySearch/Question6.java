package Array_And_BinarySearch;
//find the index of target value in sorted distinct array
// and if the target did not exist then return the index wher it can be insrted

public class Question6 {
    public static void func(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int n=arr.length;
        int ans=n;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]>=target){
                ans=mid;
                high=mid-1;

            }
            else {
                low=mid+1;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5};
        func(arr,2);
    }
}
