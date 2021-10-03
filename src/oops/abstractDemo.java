package oops;

abstract class mydemo
{
    abstract void calculate();
}

class abstractDemo extends mydemo {

    void calculate()
    {
        System.out.println("hi");
    }


}

class Diff
{
    public static void main (String[] args)
    {
        mydemo obj = new abstractDemo();
        obj.calculate();
    }
}
