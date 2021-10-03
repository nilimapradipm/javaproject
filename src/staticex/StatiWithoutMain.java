package staticex;

class StaticWithoutMain {
    //Main Method not found error
   static{
        System.out.println("static block is invoked");
        //System.exit(0);
    }
}