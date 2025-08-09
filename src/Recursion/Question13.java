package Recursion;
//Recursion using single pointer
public class Question13 {
    static void reverse(int arr[],int i){
        int n=arr.length;
        if (i>=n/2) return;
        int temp=arr[i];
        arr[i]=arr[n-i-1];
        arr[n-i-1]=temp;
        reverse(arr,i+1);
    }
    static void print(int arr[],int index){
        if (index>=arr.length) return;
        System.out.print(arr[index]+ " ");
        print(arr,index+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        reverse(arr,0);
        print(arr,0);
    }
}
