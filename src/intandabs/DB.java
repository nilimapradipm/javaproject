package intandabs;

interface MyInter
{
    void connect();
}

public class DB implements MyInter {

    public void connect() {
        System.out.println("connect DB");
    }


}
class B {

   public  static void main(String[] args)
   {
       DB inter = new DB();
       inter.connect();
   }

}

