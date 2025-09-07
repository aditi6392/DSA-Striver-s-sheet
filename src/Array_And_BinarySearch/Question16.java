package Array_And_BinarySearch;
//bruteforce approach for finding maximum sum of sub array
public class Question16 {

    public static int func(int nums[]){

        int maxsum=-1;
        for (int i=0;i<nums.length;i++){
            for (int j=i;j<nums.length;j++){

                int sum=0;
                for (int k=i;k<=j;k++){
                    sum+=nums[k];
                    maxsum=Math.max(sum,maxsum);

                }
            }

        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        System.out.println(func(arr));
        //ans=7
    }
}
