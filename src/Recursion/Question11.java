package Recursion;
//factorial using parameter
public class Question11 {
    static void fact(int fact,int n){
        if(n==0 || n==1){
            System.out.println(fact);
            return;}

        fact(fact*n,n-1);

    }

    public static void main(String[] args) {
            fact(1,5);
    }
}
