package Collections;

import java.util.HashSet;

class HashSetDemo{
    public static void main(String args[]){
        //Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ramesh");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");

        System.out.println(set);
        //Traversing elements
//        Iterator<String> itr=set.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }
}