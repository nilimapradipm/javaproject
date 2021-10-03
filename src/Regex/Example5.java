package Regex;


import java.util.regex.*;


public class Example5 {

    public static void main(String[] args) {
        // my pattern
        Pattern p = Pattern.compile("[A-Z]");

        //input Strings to be given in matcher method
        Matcher m = p.matcher("012abc");

        while (m.find()) {
           // System.out.println("Start Index:" + m.start() + " Pattern: " + m.group());
            System.out.println("Start Index:" + m.start() + " OffSet:" + m.end() + " Pattern: " + m.group());

        }


    }


}
