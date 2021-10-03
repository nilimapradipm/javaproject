public class SingletonDemo {


 public static void main(String[] args)
 {
     sample s1 = sample.getInstance();
     System.out.println(s1.hashCode());

     sample s2 = sample.getInstance();
     System.out.println(s2.hashCode());

     //sample s3 = new sample();


 }

}


class sample
{
    static sample obj = new sample();


    private sample()
    {

    }

    static sample getInstance()
    {

        return obj;
    }
}
