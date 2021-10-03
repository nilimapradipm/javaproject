package oops;

class ParentClass {
    //We Don't want to use this implementation
    static void feature() {
        System.out.println("Parent implementation of feature");
    }


}

class SubClass extends ParentClass {

    static void feature() {
        System.out.println("Subclass implementation of feature");
    }


    public static void main(String args[]) {
       feature();
    }


}

