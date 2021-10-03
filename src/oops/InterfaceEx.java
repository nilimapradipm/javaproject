package oops;


interface printable{

    void print();

}
//
//class A6 implements printable{
//
//    public void print(){System.out.println("Hello");}
//
//    public static void main(String args[]){
//
//        A6 obj = new A6();
//
//        obj.print();
//
//    }
//
//}



interface Printable{

    void print();

}

interface Showable{

    void show();  }

class InterfaceEx implements Printable,Showable {

    public void print() {
        System.out.println("Hello");
    }

    public void show() {
        System.out.println("Welcome");
    }



    public static void main(String args[]) {

        InterfaceEx obj = new InterfaceEx();

        obj.print();

        obj.show();
    }
}