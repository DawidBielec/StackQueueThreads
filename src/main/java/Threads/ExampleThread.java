package Threads;

public class ExampleThread extends Thread {
    private int id;
    private boolean shouldRun = true;

    public ExampleThread(int id){
        this.id = id;
    }

    public void stopRunning()
    {
        shouldRun = false;
    }

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
