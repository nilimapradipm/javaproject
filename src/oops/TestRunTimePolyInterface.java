package oops;
// Run Time Polymorphism:


 interface Shape {
    public void draw();

}

 class Rectangle implements Shape{

     public void draw()

    {
        System.out.println("Drawing rectangle");
    }

}

 class Square implements Shape {

    public void draw()
    {
        System.out.println("Drawing Square");

    }
 }

public class TestRunTimePolyInterface {
    public static void main(String args[]){

        Shape s = new Rectangle();
        s.draw();

        Shape s1 = new Square();
        s1.draw();


    }
}



