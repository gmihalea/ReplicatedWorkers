import java.util.concurrent.BlockingQueue;

public class WorkerThread implements Runnable{

    private BlockingQueue queue;
    private String name;

    public WorkerThread(final BlockingQueue<Runnable> queue, String name) {
        this.queue = queue;
        this.name = name;
    }

    @Override
    public void run() {
        while(true) {
            Runnable r;
            try {
                r = (Runnable) this.queue.take();
                System.out.println("Taken Item by thread name: " + this.name);
                r.run();
                System.out.println("Task completed of thread: " + this.name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
