public class RecursionExample {


        static int count=0;

        static void p(){

            count++;

            if(count<=5){

                System.out.println("hello ");

                p();

            }

        }

        public static void main(String[] args) {
            //recursive method
            p();

        }

    }

