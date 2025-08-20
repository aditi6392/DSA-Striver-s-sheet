package Recursion;

// Quick Sort
public class Question20 {
    public static void quick_sort(int arr[], int low, int high) {
        if (low < high) {
            int pIndex = f(arr, low, high);
            quick_sort(arr, low, pIndex - 1);
            quick_sort(arr, pIndex + 1, high);
        }
    }

    public static int f(int arr[], int low, int high) {
        int pivot = arr[low];
        int i = low ;
        int j = high;

        while (i < j) {
            while (i <= high && arr[i] <= pivot) i++;
            while (j >= low && arr[j] > pivot) j--;

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void main(String[] args) {
        int arr[] = {3, 2, 1, 3, 4};
        quick_sort(arr, 0, arr.length -5);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
