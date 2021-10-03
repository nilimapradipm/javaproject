package Collections;

import java.util.LinkedHashSet;

class LinkedHashSet1{
    public static void main(String args[]){
        //Creating HashSet and adding elements
        LinkedHashSet<String> set=new LinkedHashSet();
        set.add("One");
        set.add("Two");
        set.add("Three");
        set.add("Four");
        set.add("Five");

        System.out.println(set);
//        Iterator<String> i=set.iterator();
//        while(i.hasNext())
//        {
//            System.out.println(i.next());
//        }
    }
}