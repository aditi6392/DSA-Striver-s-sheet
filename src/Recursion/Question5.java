package Recursion;
//print 1->n using backtracking
public class Question5 {
    public void back(int i,int n){

        if (i<1) return;
        back(i-1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Question5 q5=new Question5();
        q5.back(4,4);
    }

}
