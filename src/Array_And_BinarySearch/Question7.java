package Array_And_BinarySearch;

//Give first and  last index of target
//Only for sorted array
//not optimal
//bruteforce
public class Question7 {
    public static void func(int []arr,int target){

        int left=0;
        int right=arr.length-1;
        //Arrays.sort(arr);
            while (left<right){
            if(arr[left]<target && arr[right]>target){
                left++;
                right--;

            }
            else if(arr[left]<target){
                left++;
            } else if (arr[right]>target) {
                right--;

            }
            else {
                System.out.println(left +" "+ right);
                break;
            }
        }

    }

    public static void main(String[] args) {
        int []arr={2, 2, 2, 2, 2};
        func(arr,2);
    }
}
