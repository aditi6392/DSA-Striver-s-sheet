package Recursion;

public class Question12 {
    //Reverse array using recursion and two pointers
    static void reverse(int []arr,int left , int right){

        if (left>=right){
            return;
        }
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        reverse(arr,left+1,right-1);
    }
    static void printArray(int arr[],int index){
        if(index==arr.length) return;

        System.out.print(arr[index]+" ");
        printArray(arr,index+1);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        reverse(arr,0,3);
        printArray(arr,0);
    }
}
