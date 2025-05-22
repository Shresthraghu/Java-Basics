/* Write a Java program to rotate an array by k positions to the right.

 # Rotate an Array :- */

import java.util.*;
public class rotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;  

        int n = arr.length;
        k = k % n; 


        reverse(arr, 0, n - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);

        
        System.out.print("Rotated Array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

