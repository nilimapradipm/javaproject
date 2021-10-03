package oops;
//car
abstract class MyClass {

    abstract void info();
    //concrete method
//    void details()
//    {
//          System.out.println("Airbag Feature");
//    }

    // brake // as an abstract since it is common feature
    //airbag // concrete implementation  // its additional or not common


}

class SubClass1 extends MyClass {


    @Override
    void info() {

        System.out.println("inside subclass");

    }
}


public class AbstractClassDemo1 {

    public static void main(String[] args) {

        SubClass1 obj = new SubClass1();
      //  Reference variable
        //MyClass obj1 = obj;
        obj.info();
    }


}
