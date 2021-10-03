package oops;

interface bank1 {

    void rateOfInterest();


}
//provided implementation of that method
class SBI1 implements bank1 {


    public void rateOfInterest() {
        System.out.println("Rate of Interest : " + 6 + "percent");

    }


}


public class InterfaceDemo {

    public static void main (String[] args)
    {
        SBI1 obj = new SBI1();
        obj.rateOfInterest();

    }


}
