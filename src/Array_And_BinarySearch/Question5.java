package Array_And_BinarySearch;
//Upper bound->The first position where the element is just (strictly) greater than element  arr[index]>x
public class Question5 {
    public static void func(int arr[],int x){
        int low=0;
        int high=arr.length-1;
        int ans=arr.length;
        while (low<=high){
            int mid=(low+high)/2;
            if (arr[mid]>x){
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
        int arr[]={1,2,3,5,6};
        func(arr,5);
    }
}
