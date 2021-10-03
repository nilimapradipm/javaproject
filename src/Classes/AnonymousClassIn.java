package Classes;

interface Eatable {

   void eat1(); //public by default

}

class AnonymousClassIn {
    public static void main(String args[]){
        //Eatable a =new Eatable()
        Eatable a =new Eatable(){

            public void eat1() {System.out.println("nice fruits");}
        };
        a.eat1();
    }
}