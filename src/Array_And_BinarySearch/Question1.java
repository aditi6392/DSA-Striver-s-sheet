package Array_And_BinarySearch;
//first largest element in an array
public class Question1 {
    static void largest(int arr[]){
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,1};
        largest(arr);

    }
}
