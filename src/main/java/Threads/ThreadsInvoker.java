package Threads;

public class ThreadsInvoker {
    public void InvokeWorkers(int numberOfThreads){
        Worker[] runners = new Worker[numberOfThreads];
        Thread[] threads = new Thread[numberOfThreads];

        // Create Worker instances - fill array Worker[] which was empty up to this point
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
        for(int i=0; i< numberOfThreads; i++) {
            threads[i].interrupt();
        }

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




    public void InvokeWorkersWithCounter(int numberOfThreads, int numberOfIncrements){
        WorkerWithCounter[] runners = new WorkerWithCounter[numberOfThreads];
        Thread[] threads = new Thread[numberOfThreads];
        WorkerWithCounter.counter = new WorkerWithCounter.Counter(); // create instance of Counter - since it's static, it will be globally shared in our app
        WorkerWithCounter.max = numberOfIncrements; // assign max Increments - since it's static, it will be globally shared in our app

        // Create Worker instances - fill array Worker[] which was empty up to this point
        for(int i=0; i < numberOfThreads; i++) {
            runners[i] = new WorkerWithCounter(i);
        }

        // Assign each Worker to a different, separate Thread
        for(int i=0; i < numberOfThreads; i++) {
            threads[i] = new Thread(runners[i]);
        }

        // Start all Threads
        for(int i=0; i < numberOfThreads; i++) {
            threads[i].start();
        }

        // Code here waits for all threads to finish

        // Terminate Threads
        for(int i=0; i < numberOfThreads; i++) {
            try {
                threads[i].join();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Final value of counter should be " + (numberOfIncrements*numberOfThreads));
        System.out.println("Actual final value of counter is: " + WorkerWithCounter.counter.getCount());
    }

    public void InvokeExampleThreads(int numberOfThreads){
        // try to implement this yourself!
    }
}
