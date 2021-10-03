package Collections;

import java.util.*;
class HashMap1{
    public static void main(String args[]){

       LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();
         //key value pairs
        hm.put(null,null);
        hm.put(101,null);
        hm.put(102,"Rahul");


        System.out.println(hm);

//        for(Map.Entry m:hm.entrySet()){
//            System.out.println(m.getKey()+" "+m.getValue());
//        }
    }
}