package NumberExample;



    public class TestValue {

        public static void main(String[] args) {
         //   Here xxx represent primitive number data types (byte, short, int, long, float, double). This method is used to convert the value of this Number object to the primitive data type specified.

            //15 digit post decimal - precision
            Double d = new Double("6.96856546546757");
            System.out.println("double value: "+d);



            byte b = d.byteValue();
            System.out.println("byte value: "+b);

            short s = d.shortValue();
            System.out.println("short value: "+s);

            int i = d.intValue();
            System.out.println("int value: "+i);

            long l = d.longValue();
            System.out.println("long value: "+l);
            //7 digit post decimal - precision
            float f = d.floatValue();
            System.out.println("value of d after converting it to float : " + f);



            double d1 = d.doubleValue();
            System.out.println("value of d after converting it to double : " + d1);

        }
    }

