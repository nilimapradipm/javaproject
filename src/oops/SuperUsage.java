package oops;
//parent class
class Animal{

     String color="white";

   //add method
    void sample()
    {
        System.out.println("Parentclass sample method");
    }
}

//sub class
class Dog extends Animal{

    String color="black";

    void sample()
    {
        System.out.println("Subclass sample method");
    }

    void printColor(){

        System.out.println(color);//prints color of Dog class

        System.out.println(super.color);//prints color of Animal class

        // call method using super
        super.sample();
    }
}

public class SuperUsage{

    public static void main(String args[]){

        Dog d=new Dog();

        d.printColor();
        //d.sample()

    }}
