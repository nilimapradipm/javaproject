package ConstructorEx;

public class ConsDemoParameter {

    public static void main(String args[]) {

        MyClass t1 = new MyClass(10);
        MyClass t2 = new MyClass(20);

        System.out.println(t1.num + " " + t2.num);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }

}