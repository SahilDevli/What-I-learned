class DemoTask1 implements Runnable { // Use Runnable for better flexibility
    
    @Override
    public void run() {
        try {
            System.out.println("Running method 1.1");
            System.out.println("Running method 1.2");
            Thread.sleep(2000); // Sleep for 2 seconds
            System.out.println("Running method 1.3");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e);
        }
    }
}
 
public class J_Multithread {
    public static void main(String[] args) throws InterruptedException {
        // Task for the first thread
        Runnable task1 = new DemoTask1();

        Thread t1 = new Thread(task1); // Wrap task in a Thread

        System.out.println("Thread state before start(): " + t1.getState());
        t1.start(); // Starts the thread 1(new thread)
        System.out.println("Thread state after start(): " + t1.getState());

        // Main thread continues execution
        System.out.println("Main thread continues...");

        t1.join(); // Wait for t1 to finish execution
        System.out.println("Thread state after completion: " + t1.getState());
    }
}

/*
 * Mwthod for Thread
    1.  th.sleep(1000) // exicute after 1 second.
    2.  th.join() // waits for the thread to finish execution.
    3.  th.start() // starts the thread.
    4.  th.isAlive() // checks if the thread is still running.
    5.  th.yield() // gives up the CPU to other threads.
    6.  th.interrupt() // interrupts the thread.
    7.  th.getName() // returns the name of the thread.

    8.  th.getPriority() // returns the priority of the thread.
    9.  th.setPriority(Thread.MAX_PRIORITY) // sets the priority of the thread.
    10. th.getState() // returns the state of the thread.

    11. th.join(1000) // waits for the thread to finish execution for a given time.
    12. th.stop() // stops the thread.
     
    13. th.setDaemon(true) // makes the thread a daemon thread.
    14. th.isDaemon() // checks if the thread is a daemon thread.

    15. th.setDefaultUncaughtExceptionHandler() // sets a default uncaught exception handler for the thread.
    16. th.setUncaughtExceptionHandler() // sets an uncaught exception handler for the thread.

    17. th.getThreadGroup() // returns the thread group of the thread
 */

 