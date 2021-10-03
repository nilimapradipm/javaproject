package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4
{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("[a-z]");
        Matcher m = p.matcher("abcdeficKlm");
        while(m.find())
        {
            System.out.println(m.start()+ "___" + m.group());
        }

    }
}
