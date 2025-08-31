package Array_And_BinarySearch;
//Lower bound theorem
//Binary Search->always works on sorted array
//Lower bound=The index of first element which is greater or equal to x where arr[index]>=x
public class Question4 {
    public static void func(int arr[],int x){
        int low=0;
        int high=arr.length-1;

        int ans=arr.length;
        while (low<=high)
        {     int mid=(low+high)/2;
            if (arr[mid]>=x){
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
        int []arr={1,2,3,4,5,9};
        func(arr,10);
    }
}
