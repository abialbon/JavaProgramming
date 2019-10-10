// PiThread will calculate every totalThreads th term of the series
class PiThread implements Runnable {
    private final int threadCount;
    private final int totalThreads;
    private double sum;
    private final long n;

    PiThread (int threadCount, int totalThreads, long n) {
        this.threadCount = threadCount;
        this.totalThreads = totalThreads;
        this.n = n;
    }

    public void run() {
        for (long i = this.threadCount; i < n; i += this.totalThreads) {
            this.sum += (double) Math.pow(-1, i)/(2*i + 1);
        }
    }

    public double getSum() {
        return this.sum;
    }
}

public class EstimatePi {
    public static void main(String[] args) throws InterruptedException {
        // Start timer to calculate execution time
        long startTime = System.currentTimeMillis();
        // Change this thread count and observe
        int THREAD_COUNT = 4;
        long n = 1000000000;
        double pi = 0;
        Thread[] t_threads = new Thread[THREAD_COUNT];
        PiThread[] p_threads = new PiThread[THREAD_COUNT];
        // Creating threads in t_threads array
        for (int i = 0; i < THREAD_COUNT; i++) {
            p_threads[i] = new PiThread(i, THREAD_COUNT, n);
            t_threads[i] = new Thread(p_threads[i]);
            t_threads[i].start();
        }
        for (int i = 0; i < THREAD_COUNT; i++) {
            t_threads[i].join();
        }
        for (int i = 0; i < THREAD_COUNT; i++) {
            pi += p_threads[i].getSum();
        }
        System.out.println(pi*4);
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken: " + (endTime - startTime)/1000 + "s");
    }
}