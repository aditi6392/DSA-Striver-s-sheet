package Recursion;
//print n->1 using backtracking
public class Question6 {
    public void back(int i,int n){

        if (i>n) return;

        back(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Question6 question6=new Question6();
        question6.back(1,4);
    }

}
