package Array_And_BinarySearch;

//Max number of  consecuti ones
public class Question15 {
    public static int func(int nums[]){
        int count=0;
        int maxcount=0;
        for (int num : nums){
            if (num==1){
                count++;
                maxcount=Math.max(maxcount,count);

            }
            else count=0;
        }
        return maxcount;
    }

    public static void main(String[] args) {
        int nums[]={1,1,1,0,1,1,1,1};
        System.out.println(func(nums));
    }
}
