package oops;

// inheritance

class SuperClassA {

    public void foo(){

        System.out.println("SuperClassA");

    }

}class SubClassB extends SuperClassA{

//    public void foo(){
//
//        System.out.println("SubclassB overide method ");
//
//    }


    public void bar(){

        System.out.println("SubClassB");

    }}

public class Test {

    public static void main(String args[]){

        SubClassB a = new SubClassB(); ////invokes only parent & subclass methods
        //SuperClassA a = new SubClassB(); ///invokes only superclass methods
         //SuperClassA a = new SuperClassA(); //invokes only parent methods

      //  SubClassB a = new SuperClassA();
        a.foo();

        a.bar();

    }}