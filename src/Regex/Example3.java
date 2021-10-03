package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3
{
    public static void main(String[] args) {
        Pattern p = Pattern.compile("a+");

        //Pattern p = Pattern.compile("\\d");

        Matcher m = p.matcher("abaabaaab");
        while(m.find())
        {

            System.out.println(m.start()+ "___" + m.group());
        }

    }
}
