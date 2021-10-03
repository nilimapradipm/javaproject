package loops;

public class Continue {



        public static void main(String[] args) {
            //1,2,3,4,6,7,8,9,10
            for (int i = 1; i <= 10; i++) {

                if (i == 5) {

                    continue; //control passes to next iteration of for loop & subsequent statement below are not executed

                }
                //it will get bypassed
                System.out.println(i);

            }
        }
    }


