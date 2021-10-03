public class FinalVariable {
    final int x = 10;


    public static void  main (String args[])
    {

        FinalVariable obj = new FinalVariable();
        obj.method();
    }

    void method() {
        //x = 20;
    }

}
