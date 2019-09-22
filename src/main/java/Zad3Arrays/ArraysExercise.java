package Zad3Arrays;

import java.util.Random;

public class ArraysExercise {
    private int[] _array;
    private int[] _array2;
    private int[] _array3;

    public void InitializeAndFillArray(int n){
        _array = new int[n];

        for (int i=0; i < n; i++){
            _array[i] = i;
        }
    }

    public void InitializeAndFillArrayWithPreviousMemberSum(int n){
        _array2 = new int[n];

        for (int i=0; i < n; i++){
            if (i % 2 != 0){
                _array2[i] = i + _array2[i-1];
            }else{
                _array2[i] = i;
            }
        }
    }

    public void InitializeAndFillArrayWithRandomNumbers(int n, int minValue, int maxValue){
        _array3 = new int[n];
        Random rand = new Random();


        for (int i=0; i < n; i++){
            _array3[i] = rand.nextInt(maxValue - minValue) + minValue;
        }
    }

    public void PrintArrayValues(){

        PrintArray(_array);
        PrintArray(_array2);
        PrintArray(_array3);
    }

    public void PrintArray(int[] array){
        // Display from the end
        for (int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Display only odd numbers
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        // Display sum of previous numbers
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
            System.out.print(sum + " ");
        }
        System.out.println();

        // Display sum of all greater than 5
        sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] > 5) {
                sum += array[i];
            }
        }
        System.out.print(sum);
        System.out.println();
    }
}
