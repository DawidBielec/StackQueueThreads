package Zad8Stack_and_Queue;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {

    private List<T> arr = new ArrayList<T>();

    public void push(T newData){
        arr.add(newData);
    }

    public T pop(){
        if (!isEmpty()){
            int lastIndex = getLastIndex();

            T val = arr.get(lastIndex);
            arr.remove(lastIndex);

            return val;
        }
        else{
            throw new RuntimeException("Stack underflow!");
        }
    }

    public T peek(){
        if (!isEmpty()){
            return arr.get(getLastIndex());
        }

        return null;
    }

    public boolean isEmpty(){
        return arr.size() < 1;
    }

    private int getLastIndex(){
        return arr.size() - 1;
    }

}
