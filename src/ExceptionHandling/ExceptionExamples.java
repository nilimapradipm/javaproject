package ExceptionHandling;

public class ExceptionExamples {

    public static void main(String[] args) {

        try {

           // int a[]  = new int[10];
            //System.out.println(a[12]);

            String s = null;
            System.out.println(s.length());


        } catch (Exception e) {
            System.out.println(e);
        }

        // add some print
        System.out.println("Remaining Code");
    }



}
