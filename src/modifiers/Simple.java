package modifiers;

  class A{

    //int data=40;
     //void msg(){System.out.println("Hello java");}

     //private int data=40;
     //private void msg(){System.out.println("Hello java");

         public int data=40;
         public void msg(){System.out.println("Hello java");}




     }





public class Simple{

    public static void main(String args[]){

        A obj=new A();

        System.out.println(obj.data);//Compile Time Error  ​

        obj.msg();//Compile Time Error  ​

    }

}