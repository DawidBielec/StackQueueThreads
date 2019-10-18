package Threads;

public class ThreadsInvoker {
    public void InvokeWorkers(int numberOfThreads){
        Worker[] runners = new Worker[numberOfThreads];
        Thread[] threads = new Thread[numberOfThreads];

        // Create Worker instances
        for(int i=0; i < numberOfThreads; i++) {
            runners[i] = new Worker(i);
        }

        // Assign each Worker to a different, separate Thread
        for(int i=0; i < numberOfThreads; i++) {
            threads[i] = new Thread(runners[i]);
        }

        // Start all Threads
        for(int i=0; i < numberOfThreads; i++) {
            threads[i].start();
        }

        // Interrupt Threads - does it stop them permanently?
        //for(int i=0; i<10; i++) {
        //    threads[i].interrupt();
        //}

        try
        {
            // begin count-down to terminate Threads
            for (int i = 5; i >= 0; i--){
                System.out.println("Stopping in..." + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }

        // Terminate Threads
        for(int i=0; i < numberOfThreads; i++) {
            runners[i].stopRunning();
        }
    }

    public void InvokeExampleThreads(int numberOfThreads){
        // try to implement this yourself!
    }
}
