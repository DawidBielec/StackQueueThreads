package Zad8Stack_and_Queue;

import java.util.Arrays;

/**
 * Less efficient than {@link Zad8Stack_and_Queue.Stack}
 * @param <T> Type of stack.
 */
public class StackArray<T> {
    /**
     * Best-case scenario memory complexity: O(1)  {array is empty}
     * Average-case scenario memory complexity: O(n)  {because it will probably not stay empty}
     */
    T[] arr = (T[]) new Object[0]; // trzeba jakoś rozwiązać sprawę rozmiaru. Czy da się zmniejszać / zwiększać rozmiar tablicy??
                                   // Jeśli nie, to jak to ominąć???

    /**
     * Time complexity: O(n)
     * Memory complexity: O(n)
     * @param newData
     */
    public void push(T newData) {
        arr = Arrays.copyOf(arr, getCurrentSize() + 1); // O(n)
        arr[getLastIndex()] = newData; // O(1)
    }

    /**
     * Time complexity: O(n)
     * Memory complexity: O(n)
     * @return
     */
    public T pop(){
        if (!isEmpty()){ // O(1)
            int lastIndex = getLastIndex(); // O(1)

            T val = arr[lastIndex]; // O(1)
            arr = Arrays.copyOf(arr, getCurrentSize() - 1); // O(n)

            return val;
        }
        else{
            throw new RuntimeException("Stack underflow!");
        }
    }

    /**
     * Time complexity: O(1)
     * Memory complexity: O(1)
     * @return
     */
    public T peek(){
        if (!isEmpty()){ // O(1)
            return arr[getLastIndex()]; // O(1)
        }

        return null;
    }

    /**
     * Time complexity: O(1)
     * Memory complexity: O(1)
     * @return
     */
    public boolean isEmpty(){
        return getCurrentSize() < 1;
    }

    /**
     * Time complexity: O(1)
     * Memory complexity: O(1)
     * @return
     */
    private int getLastIndex(){
        return getCurrentSize() - 1;
    }

    /**
     * Time complexity: O(1)
     * Memory complexity: O(1)
     * @return
     */
    private int getCurrentSize(){
        return arr.length;
    }
}
