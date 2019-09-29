package Zad7Arrays;

import java.util.Scanner;

public class ArrayTasks {
    /**
     * Time complexity: O(n)
     * Memory complexity: O(n)
     * @param n
     * @return
     */
    public static long[] fibonacci(int n){
        if (n < 1){ // O(1)
            throw new ArrayIndexOutOfBoundsException("Argument n: " + n + " is less than 1, which is not allowed.");
        }

        long[] arr = new long[n]; // Time complexity O(1), Memory complexity: O(n)
        arr[0] = 0; // O(1)
        long n2 = 1; // O(1)

        if (n == 2){ // O(1)
            arr[1] = n2; // O(1)
            return arr;
        }

        arr[1] = n2; // O(1)
        for (int i = 2; i < n; i++){ // O(n)
            arr[i] = arr[i-2] + arr[i-1]; // O(1)
        }

        return arr;
    }

    public static long[] addArrays(int[] arr1, int[] arr2){
        // arr1 memory complexity = O(n)
        // arr2 memory complexity = O(m) = O(n)
        // O(2n) ~ O(n)
        int minLength = arr1.length < arr2.length ? arr1.length : arr2.length;
        int maxLength = arr1.length > arr2.length ? arr1.length : arr2.length;

        long[] result = new long[maxLength];

        for(int i = 0; i < minLength; i++){
            result[i] = arr1[i] + arr2[i];
        }

        // handle values outside of minLength
        if (minLength != maxLength){
            if (arr1.length == maxLength){
                for(int i = minLength; i < maxLength; i++){
                    result[i] = arr1[i];
                }
            }else {
                for(int i = minLength; i < maxLength; i++){
                    result[i] = arr2[i];
                }
            }
        }

        return result;
    }

    public static int[] readArrayFromIo(){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter number of elements: ");
        int n=s.nextInt();
        int arr[]= new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }

        return arr;
    }
}
