public class ThreadTask extends Thread {

    public  void run(){

        System.out.println("Inside Thread");

    }


    public static void main(String[] args) {

        ThreadTask threadTask = new ThreadTask();
        threadTask.start();
        //threadTask.start();

    }
}
