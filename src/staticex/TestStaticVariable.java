package staticex;

//Java Program to demonstrate the use of static variable
class Student {
    //instance variable for unique property
    int rollno;
    String name;
    static String college ="KDK";//static variable refers to common property

    //constructor
    Student(int rollno, String name){
       this.rollno = rollno;
        this.name = name;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
}
//Test class to show the values of objects
public class TestStaticVariable{
    public static void main(String args[]){
        Student s1 = new Student(11,"Karan");
        Student s2 = new Student(22,"Amar");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
    }
}

