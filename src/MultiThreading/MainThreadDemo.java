package MultiThreading;

public class MainThreadDemo {

    public static void main (String[] args)


    {
       // Thread t = new Thread()

        Thread t = Thread.currentThread();
        System.out.println("Information about current thread : " + t);


    }
}
