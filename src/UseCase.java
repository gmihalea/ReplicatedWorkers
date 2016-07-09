public class UseCase {

    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool(Constants.NR_OF_THREADS);

        threadPool.submitTask(() -> {
            System.out.println("Starting Task A....");
            try {
                Thread.sleep(Constants.NR_OF_SECONDS_THREAD_1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task A Completed....");
        });

        threadPool.submitTask(() -> {
            System.out.println("Starting Task B....");
            try {
                Thread.sleep(Constants.NR_OF_SECONDS_THREAD_2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task B Completed....");
        });

        threadPool.submitTask(() -> {
            System.out.println("Starting Task C....");
            try {
                Thread.sleep(Constants.NR_OF_SECONDS_THREAD_3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task C Completed....");
        });
    }
}
