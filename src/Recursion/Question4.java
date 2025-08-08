package Recursion;
//linearly from n to 1
public class Question4 {

    public  void linearly(
            int n){

        if(n==0) return;
        System.out.println(n);
        linearly(n-1);
    }

    public static void main(String[] args) {
        Question4 q4=new Question4();
        q4.linearly(4);
    }
}
