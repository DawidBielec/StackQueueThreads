package Threads;

/**
 * Worker, something to be run by a Thread. Implementing Runnable interface is a preferred way to go,
 * following the rules 'Inherit only if you want to override some behavior.' and 'Inherit less, interface more.'.
 */
public class WorkerWithCounter implements Runnable {

    private int id;

    static Counter counter;
    static int max;

    public WorkerWithCounter(int id){
        this.id = id;
    }


    @Override
    public void run() {
        for (int i = 0; i < max; i++) {
            System.out.println("Thread "+id);
            counter.inc();
        }
    }

    static class Counter {

        int count;
        synchronized void inc() { // without 'synchronized' we may lose some data, you must make it synchronized!
            count = count+1;
        }
        int getCount() { // here we don't change variable, so 'synchronized' is not required
            return count;
        }
    }
}