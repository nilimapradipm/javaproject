public class SingletonDemon {

    public static void main(String[] args) {
        //calling method from outside
        SampleDemo s = SampleDemo.getInstance();
        System.out.println(s.hashCode());

        SampleDemo s1 = SampleDemo.getInstance();
        System.out.println(s1.hashCode());

        // SampleDemo s3 = new SampleDemo();


    }


}

class SampleDemo {
    static SampleDemo obj = new SampleDemo();

    private SampleDemo() {

    }

    static SampleDemo getInstance() {
        return obj;
    }


}



