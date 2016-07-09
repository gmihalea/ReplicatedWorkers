import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadPool {

    private BlockingQueue<Runnable> tasksQueue;
    private int noOfThreads;

    public ThreadPool(final int noOfThreads) {
        this.tasksQueue = new LinkedBlockingQueue<>();
        this.noOfThreads = noOfThreads;

        for(int i = 0; i < this.noOfThreads; ++i) {
            Thread th = new Thread(new WorkerThread(this.tasksQueue, String.valueOf(i)));
            th.start();
        }
    }

    public void submitTask(Runnable r) {
        this.tasksQueue.add(r);
    }
}
