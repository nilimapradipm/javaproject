package NumberExample;

public class BooleanEquals {


    public static void main(String[] args) {

        // creating a Short Class object with value "15"

        Short s = new Short("15");


        // creating a Short Class object with value "10"

        Short x = 10;


        // creating an Integer Class object with value "15"
        Integer y = 15;



        // creating another Short Class object with value "15"

        Short z = 15;



        //comparing s with other objects

        System.out.println(s.equals(x));

        System.out.println(s.equals(y));

        System.out.println(s.equals(z));
    }
}
