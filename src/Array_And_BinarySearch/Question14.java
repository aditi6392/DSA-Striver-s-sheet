package Array_And_BinarySearch;
//filter 0 and 1
public class Question14 {
    public static void func(int []arr){
        int left=0;
        int right=arr.length-1;

        while (left<right){
            if(arr[left]==0 && arr[right]==1){
                arr[left]=0;
                left++;
                right--;
            }
            if (left==0 && right==0){

                right--;
            }
        }
    }
}
