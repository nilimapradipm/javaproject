package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {

//    public boolean find()It Attempts to find the Next Match and returns true if it is available.
//    public int start()Returns Start Index of The Match
//    public int end()Returns end Index of The Match
//    public String group()Returns the Matched Patteren

//Note : in matcher we will give input & in compile the pattern we searching for
    public static void main(String[] args) {

        int count = 0;

        Pattern p = Pattern.compile("kous");

        Matcher m = p.matcher("koushkoushickkous");

        while (m.find()) {

            count++;
            //end here is offset that is last index +1

            System.out.println(m.start() + "___" + m.end() + "___" + m.group());

        }

        System.out.println("The Total Occurances are " + count);

    }
}


