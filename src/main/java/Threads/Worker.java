package Threads;

/**
 * Worker, something to be run by a Thread. Implementing Runnable interface is a preferred way to go,
 * following the rules 'Inherit only if you want to override some behavior.' and 'Inherit less, interface more.'.
 */
public class Worker implements Runnable {

    private int id;
    private boolean shouldRun = true;

    public Worker(int id){
        this.id = id;
    }

    public void stopRunning()
    {
        shouldRun = false;
    }


    @Override
    public void run() {
        while(shouldRun) {
            System.out.println("Thread "+id);
            try {
                // go to sleep for 500ms
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
