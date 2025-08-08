package Recursion;
//sum of n number using parameters
public class Question8 {
    public void sum(int n,int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sum(n-1,sum+n);
    }

    public static void main(String[] args) {
        Question8 question8=new Question8();
        question8.sum(5,0);
    }
}
