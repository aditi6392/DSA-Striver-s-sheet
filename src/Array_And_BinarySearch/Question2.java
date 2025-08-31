package Array_And_BinarySearch;
//second largest
public class Question2 {
    static void secLargest(int []arr){
        int largest=arr[0];
        int seclarge=-1;
        for(int i=0;i< arr.length;i++){
            if(arr[i]>largest){
                seclarge=largest;
                largest=arr[i];
            }
            else if(arr[i]>seclarge && seclarge<largest){
                seclarge=arr[i];
            }
        }
        System.out.println(seclarge);
    }

    public static void main(String[] args) {
        int arr[]={1,4,5,2,3};
        secLargest(arr);
    }
}
