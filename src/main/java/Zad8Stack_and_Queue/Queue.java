package Zad8Stack_and_Queue;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {

    private List<T> arr = new ArrayList<T>();

    public void push(T newData){
        arr.add(newData);
    }

    public T pop(){
        if (!isEmpty()){
            T val = arr.get(0);
            arr.remove(0);

            return val;
        }
        else{
            throw new RuntimeException("Stack underflow!");
        }
    }

    public T peek(){
        if (!isEmpty()){
            return arr.get(0);
        }

        return null;
    }

    public boolean isEmpty(){
        return arr.size() < 1;
    }

    @Override
    public String toString(){
        return arr.toString(); // is equal to = Arrays.toString(arr.toArray());
    }
}
