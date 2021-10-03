package ExceptionHandling;

 class FinallyEx {
     public static void main(String args[]) {
         try {
//below code do not throw any exception
             //int data = 25 / 0;
             //System.out.println(data);
             String s = null;
             System.out.println(s.length());


         }
//catch won't be executed
         catch (ArithmeticException e) {
             System.out.println(e);
         }
         catch (ArrayIndexOutOfBoundsException e) {
             System.out.println(e);
         }
         catch (NullPointerException e) {
             System.out.println(e);
         }
//executed regardless of exception occurred or not
         finally {
             System.out.println("finally block is always executed");
         }
         System.out.println("Remaining code");
     }

 }