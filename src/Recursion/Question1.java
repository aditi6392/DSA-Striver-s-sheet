package Recursion;

public class Question1 {
    int count=0;
    public void print(){
        if(count==3){
            return;
        }
        System.out.println(count);
        count++;
        print();

    }

    public static void main(String[] args) {
        Question1 eg=new Question1();
        eg.print();
    }
}
