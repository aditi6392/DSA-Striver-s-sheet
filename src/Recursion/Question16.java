package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Question16 {



            // Function to print all subsequences
            static void printSubsequences(int[] arr, int index, List<Integer> current) {
                // 👉 Base case: if index reached end of array
                if (index == arr.length) {
                    System.out.println(current);  // print one subsequence
                    return;
                }

                // 👉 Choice 1: include arr[index]
                current.add(arr[index]);                   // add element
                printSubsequences(arr, index + 1, current); // go deeper
                current.remove(current.size() - 1);        // backtrack (remove element)

                // 👉 Choice 2: exclude arr[index]
                printSubsequences(arr, index + 1, current);
            }

            public static void main(String[] args) {
                int[] arr = {3, 1, 2};
                System.out.println("All subsequences:");
                printSubsequences(arr, 0, new ArrayList<>());
            }
        }

