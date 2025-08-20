package Recursion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

//Subset sum 1
public class Question23 {
    private static void subsetSum(int ind, int sum,ArrayList<Integer> arr,int N,ArrayList<Integer> sumsub)
    {
        if (ind==N){
            sumsub.add(sum);
            return;
    }
        //pick
        subsetSum(ind+1,sum+arr.get(ind),arr,N,sumsub);
        //Not Pick
        subsetSum(ind+1,sum,arr,N,sumsub);
    }
    public static ArrayList<Integer> subsetSum1(ArrayList<Integer> arr,int N){
        ArrayList<Integer> sumsubset=new ArrayList<>();
        subsetSum(0,0,arr,N,sumsubset);
        Collections.sort(sumsubset);
        return  sumsubset;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(3);
        int N=arr.size();
        ArrayList<Integer> result= subsetSum1(arr,N);
        for (int num :result ){
            System.out.print(num +" ");
        }
    }
}
