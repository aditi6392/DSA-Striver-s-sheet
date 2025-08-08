package Recursion;

//sum of n number
public class Question7 {

    public void sum(int i,int sum,int n){

        if (i==n) return;

        sum(i+1,sum+i,n);
        System.out.println(sum);
    }

    public static void main(String[] args) {
        Question7 question7=new Question7();
        question7.sum(1,0,5);
    }
}
