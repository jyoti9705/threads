public class ThreadRunnable implements Runnable{
    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

        System.out.println("In Runnable Thread class");
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName());
        } catch (InterruptedException e) {

        }


    }

    public static void main(String[] args) throws InterruptedException {

        ThreadRunnable threadRunnable = new ThreadRunnable();
        Thread thread = new Thread(threadRunnable);
        thread.start();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());


    }
}
