package ExceptionHandling;

class ArithmeticExceptionEx {
    public static void main(String args[]) {
        try{
            int x = 0;int y = 10;
            int z = y/x;

        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        // add some print
        System.out.println("Remaining Code");

        //Continue with the flow we need to handle this exceptions
    }}
