package Recursion;

//Find fibonacci number at n ; fibo[4]=3
public class Question15 {
    public static int  fibo(int n){
        if (n<=1) return n;
        int last=fibo(n-1);
        int second_last=fibo(n-2);
        return last+second_last;
    }

    public static void main(String[] args) {
        System.out.println(fibo(3));
    }
}
