package Recursion;

public class Question2 {
    int count =0;
    public void name(){
        if(count==5) return;
        System.out.println("Aditi");
        count++;
        name();
    }

    public static void main(String[] args) {
        Question2 q2=new Question2();
        q2.name();
    }
}
