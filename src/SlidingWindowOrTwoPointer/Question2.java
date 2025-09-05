package SlidingWindowOrTwoPointer;
import java.util.HashSet;
//Leetcode 3
//Find length of longest substring without duplicates

public class Question2 {
    public static int func(String s){
        int n=s.length();
        int left=0;
        int maxlen=0;
        HashSet<Character> set=new HashSet<>();
        for (int right=0;right<n;right++){
            char c=s.charAt(right);
            if (set.contains(c)){
                set.remove(c);
                left++;
            }
            set.add(c);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;

    }

    public static void main(String[] args) {
        String s="cadbzabcd";
        System.out.println(func(s));
    }
}
