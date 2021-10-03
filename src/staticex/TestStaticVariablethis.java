package staticex;

//Java Program to demonstrate the use of static variable
class Student1 {
    //instance variable for unique property
    int rollno;
    String name;
    static String college ="KDK";//static variable refers to common property

    //constructor
    //Confused whether rollno is instance variable or argument if this keyword is not given
    Student1(int rollno, String name){
        this.rollno = rollno; //here it will store local variables rollno & name passed as argument into instant variables
        this.name = name;
    }
    //method to display the values
    void display (){System.out.println(rollno+" "+name+" "+college);}
}

//Test class to show the values of objects
public class TestStaticVariablethis{
    public static void main(String args[]){
        Student1 s1 = new Student1(11,"Karan");
        Student1 s2 = new Student1(22,"Amar");
        //we can change the college of all objects by the single line of code
        //Student.college="BBDIT";
        s1.display();
        s2.display();
    }
}

