 class Person {

   //instance variable
    String name ;
    int age;

//default one
    Person()
    {
        name = "Shyam";
        age = 10;
    }
//parsmetrised constructor
     Person(String name1, int age1)
     {
         name = name1;
         age = age1;
     }



     void info()
    {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


 }

 class demo {

     public static void main (String[] args)
     {
         // object
         //Person p1 = new Person(); //heap memory
       //  p1.info();


         // object
        Person p2 = new Person("Ram", 12); //heap memory

      //   System.out.println(p1.hashCode());
         //Person p2 = new Person(); //heap memory
         //System.out.println(p2.hashCode());
         p2.info();
        // p2.info();
        //System.out.println(p1.info());


     }

 }



