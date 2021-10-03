package staticex;

class Staticblock {
    static int a;
    //executed before main method at the time of classloading
    static {
        System.out.println("static block is invoked");
        a = 1;

    }

    Staticblock() {
        System.out.println("Constructor is invoked");
    }

    public static void main(String args[]) {
        Staticblock sb = new Staticblock();
        System.out.println("a :  "  +a);
    }


}


