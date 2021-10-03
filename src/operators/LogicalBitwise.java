package operators;

public class LogicalBitwise {



        public static void main(String args[]){

            int a=2;

            int b=5;

            int c=20;

            System.out.println(a<b&&a++<c);       //1st condition is false && true = false

            System.out.println(a);                     //10 because second condition is not checked

            System.out.println(a<b&a++<c);                 //false && true = false
            System.out.println(a);                       //11 because second condition is checked

        }}

