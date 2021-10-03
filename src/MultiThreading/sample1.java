package MultiThreading;

class TestCallRun2 extends Thread{

    public void run(){

        for(int i=1;i<5;i++){
            try{
                //to stop thread for specified time
               Thread.sleep(500);

           }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TestCallRun2 t1=new TestCallRun2();
        TestCallRun2 t2=new TestCallRun2();
    ///New
        Thread T1 = new Thread(t1);


        Thread T2 = new Thread(t2);

        T1.start(); // Runnable or Running state depends on TS Tread Schedular if picked up
     //   System.out.println("------");
        T2.start();
    }
}