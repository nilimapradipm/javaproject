package NumberExample;

//All the six classes - Byte, Short, Long, Float, Double, Integer

//equals
//toString()
//xxxValue()

//valueOf
//parsexxx()



public class ByteEx {
    static int i=1;
    public static void main(String[] args) {
        Byte byte1 = 5;
        Byte byte2 = 67;


        // It compares two Byte objects numerically
        int val1 = byte1.compareTo(byte2);
        // byte1 > byte2 -> > 0
      ///  byte1 = byte2  -> then  0
        //byte1 < byte2 -> < 0
        if (val1 > 0) {
            System.out.println(i++ + ". " + byte1 + " is greater than " + byte2);
        } else {
            System.out.println(i++ + ". " + byte2 + " is greater than " + byte1);
        }

        //It is used check whether both values are equal or not.
        Boolean b1 = byte1.equals(byte2);
        if (b1) {
            System.out.println(i++ + ". "+byte1 + " and " + byte2 +" are equal.");
        }
        else{
            System.out.println(i++ + ". "+byte1 + " and " + byte2 +" are not equal.");
        }

        //Returns a string representation of the Byte?s object
        String f4 = byte2.toString();
        System.out.println(i++ + ". "+"String value of "+byte2+ " is : "+f4);
//
//        // hash code of byte value byte1
//        int f1 = byte1.hashCode();
//        System.out.println(i++ + ". " + "Hash code value of " + byte1 + " is : " + f1);
//
//        //returns the value of this Byte as a Float
//        Float f2 = byte2.floatValue();
//        System.out.println(i++ + ". " + "Float value of " + byte2 + " is : " + f2);
//        //returns the value of this Byte as a Float
//        Integer f3 = byte2.intValue();
//        System.out.println(i++ + ". " + "Integer value of " + byte2 + " is : " + f3);
//
//
//
//        //returns the value of this Byte as a long
//        Long f7 = byte2.longValue();
//        System.out.println(i++ + ". "+"Long value of "+byte2+ " is : "+f7);
//
//        //It returns a double value for this Byte object
//        Double f5 = byte1.doubleValue();
//        System.out.println(i++ + ". "+"Double value of "+byte1+ " is : "+f5);
    }
}




