package Zad8Stack_and_Queue;

import java.util.ArrayList;
import java.util.List;

/**
 * More efficient than {@link Zad8Stack_and_Queue.StackArray}
 * @param <T> Type of stack.
 */
public class Stack<T> {

    /**
     * Time complexity: O(1)
     * Best-case scenario memory complexity: O(1)  {list is empty}
     * Average-case scenario memory complexity: O(n)  {because it will probably not stay empty}
     */
    private List<T> arr = new ArrayList<T>();

    /**
     * Time complexity: O(1)
     * Memory complexity: O(1)
     * @param newData
     */
    public void push(T newData){
        arr.add(newData); // O(1)
    }

    /**
     * Time complexity: O(n)
     * Memory complexity: O(1)
     * @return
     */
    public T pop(){
        if (!isEmpty()){  // O(1)
            int lastIndex = getLastIndex(); // O(1)

            T val = arr.get(lastIndex); // O(1)
            arr.remove(lastIndex); // O(n)

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
            return arr.get(getLastIndex()); // O(1)
        }

        return null;
    }

    /**
     * Time complexity: O(1)
     * Memory complexity: O(1)
     * @return
     */
    public boolean isEmpty(){
        return arr.size() < 1; // O(1)
    }

    /**
     * Time complextiy: O(1)
     * Memory complexity: O(1)
     * @return
     */
    private int getLastIndex(){
        return arr.size() - 1; // O(1)
    }

}
