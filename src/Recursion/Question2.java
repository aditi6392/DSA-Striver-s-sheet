package Recursion;
//Printing names n times


import java.util.Scanner;


public class Question2 {
    public void name(int i,int n){
        if(i>n) return;

        System.out.println("Aditi");
        name(i+1,n);    //RECURSION
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Question2 q2=new Question2();
        q2.name(1,n);
    }
}
