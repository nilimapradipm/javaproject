package Collections;

import java.util.ArrayList;

public class ArrayListEX {

    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<String>();
        list.add("marigold");
        list.add("jasmine");
        list.add("jasmine");
        list.add(null);
        list.add("rose");
        list.add("lily");

       // System.out.println(list);

        for (String s : list)
        {
            System.out.println(s);
        }




    }


}
