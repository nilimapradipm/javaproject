package oops;

public class MethodOverloadingDemo {

   static void addition(int a ,  int b)
    {
        int sum ;
        sum = a + b;
        System.out.println(sum);
    }

    static void addition(int a ,  int b, int c)
    {
        int sum ;
        sum = a + b + c;
        System.out.println(sum);
    }


    public static void main (String[] args)
    {
        addition(11 , 12);
        addition(11 , 12, 13);
    }






}
