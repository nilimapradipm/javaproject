package MultiThreading;

class Multi extends Thread{

    public void run(){
        System.out.println("thread is running...");
    }


    public static void main(String args[]){
        Multi t=new Multi();
        Thread t1 = new Thread(t);

        t1.start();
    }
}
