package Array_And_BinarySearch;
//Optimal solution for max sum of subarray
//Kadane's algo
public class Question17 {
    public int func(int nums[]){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            sum=sum+nums[i];

            maxsum=Math.max(sum,maxsum);


            if (sum<0) sum=0;
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int nums[]={-2,-1,2,3,-1,9,-8};
        Question17 q=new Question17();
       int res=q.func(nums);
        System.out.println(res);
    }
}
