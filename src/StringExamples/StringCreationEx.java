package StringExamples;

public class StringCreationEx {

    public static void main(String[] args)
    {
         //using string literal
        String sample1 = "Java Programming";
        String sample2 = "Java Programming";
         //new keyword
        String sample3 = new String("Java Programming");
        String sample4 = new String("Java Programming");

        //create string by using char array
        char[] chararry = {'j','a', 'v', 'a'};
        String sample5 = new String(chararry);

        System.out.println(sample5);

      //  System.out.println(sample1);
        //System.out.println(sample2);

      //  == operator

        if (sample3== sample4) //Compares Memory address or references
        {
            //System.out.println("Memory address Both are same");
        }
        else {
            sample3.hashCode();
            sample4.hashCode();
           // System.out.println("Memory address of sample3" +    sample3.hashCode());
           // System.out.println("Memory address of sample4" +    sample4.hashCode());
        }
//        if (sample1.equals(sample3)) //Compares content
//        {
//            System.out.println("Content of Both are same");
//        }
//        else
//            System.out.println("Content Not same");



    }
}
