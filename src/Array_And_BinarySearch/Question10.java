package Array_And_BinarySearch;
//find sqrt of num , if it is in float then return nearest possible integer
//optimal approach
public class Question10 {
    public static int func(int num){
        int low=1;
        int high=num;
        int ans = 1;
        while (low<=high){
            int mid=(low+high)/2;
            if (mid*mid<=num) {
                ans=mid;
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        System.out.println( func(8));;
    }
}
