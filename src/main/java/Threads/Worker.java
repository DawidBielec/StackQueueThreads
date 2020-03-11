package Threads;

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
