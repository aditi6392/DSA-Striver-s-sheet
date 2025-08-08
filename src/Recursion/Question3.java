package Recursion;

import java.util.Scanner;

//print lineraly 1 to n
public class Question3 {
    public void linear(int i,int n){
        if (i>n) return;
        System.out.println(i);
        linear(i+1,n);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Question3 q3=new Question3();
        q3.linear(1,n);
    }
}
