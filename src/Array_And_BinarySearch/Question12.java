package Array_And_BinarySearch;
//find min value in rotated sorted array
public class Question12 {
   public static void func(int arr[]){
       int left=0;
       int right=arr.length-1;
       while (left<right){
           int mid=(left+right)/2;
           if (arr[mid]>arr[right]){
               left=mid+1;
           }
           else{
               right=mid;
           }

       }
       System.out.println(arr[left]);
   }

    public static void main(String[] args) {
        int arr[]={3,4,5,1,2};
        func(arr);
    }

}
