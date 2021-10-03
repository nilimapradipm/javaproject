package Classes;

class Outer
{
 private static int data=30;

  static class  Inner{
  void msg(){System.out.println("Inner Class Data "+ data);}
 }
//
// class  Inner{
//  void msg(){System.out.println("Inner Class Data");}
// }
 public static void main(String args[]){
 //Outer obj=new Outer();
// Outer.Inner in=obj.new Inner();
  Outer.Inner in = new Outer.Inner();
  in.msg();
 }
 }

