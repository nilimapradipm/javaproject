package StringExamples;

public class StringBuEx {

    public static void main(String[] args) {
        //immutable
//        String s1 = "Hello";
//        String s2 = "World";
//        s1 = s1+s2;
//        System.out.println(s1);



        //the StringBuilder , but each method in StringBuffer is synchronized that is StringBuffer is thread safe .
        //
        //Due to this it does not allow two threads to simultaneously access the same method . Each method can be accessed by one thread at a time .
        StringBuffer sb = new StringBuffer("Java");
        sb.append("Program");
        System.out.println(sb);


        //manipulate string using string builder
        StringBuilder sb1 = new StringBuilder("Java");
        sb1.append("Program");
        System.out.println(sb1);


    }

}
