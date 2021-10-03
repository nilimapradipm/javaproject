package ConstructorEx;

class MyClass {

    int num;

    MyClass() {

        num = 100;

    }

    MyClass(int x) {

        num = x;

    }


}

public class ConsDemo {

    public static void main(String args[]) {

        MyClass t1 = new MyClass();
        MyClass t2 = new MyClass();

        System.out.println(t1.num + " " + t2.num);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
    }

}