class MyThread extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
            System.out.println(currentThread().getName()+" > "+i);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Interrupted");
            }
        }
    }
}

public class thr {
    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("Thread 1");
        t2.setName("Thread 2");

        t1.start();
        t2.start();

        t1.join();
        t2.join();


        System.out.println("Finish");
    }
}
