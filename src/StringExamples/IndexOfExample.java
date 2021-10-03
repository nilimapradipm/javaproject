package StringExamples;

public class IndexOfExample {
    public static void main(String args[]){
    String str1 = new String("This is a Beginners Book tutorial");
         System.out.println("Index of B in str1: "+str1.length());
            System.out.println("Index of B in str1: "+str1.lastIndexOf('B'));

            System.out.println("Index of B in str1 after 15th char:"+str1.indexOf('B', 15));
//returns -1 as no such char after 30th
            System.out.println("Index of B in str1 after 30th char:"+str1.indexOf('B', 30));
}
}