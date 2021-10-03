package intandabs;

abstract class MyAbstract
{
    //without any body
     abstract void  connect();
}

class DB1 extends MyAbstract {

    void connect()
    {
        System.out.println("connect DB");
    }

}

public class B1 {

   public  static void main(String[] args)
   {
       DB1 db1 = new DB1();
       db1.connect();
   }

}

