package staticex;

class StaticVariable{
     static int count=0;//will get memory only once and retain its value but if remove static then it will get memory each time instance is created



    StaticVariable(){
        count++;//incrementing the value of static variable
        System.out.println(count);
    }

    public static void main(String args[]){
//creating objects
        StaticVariable c1=new StaticVariable();
        StaticVariable c2=new StaticVariable();

    }
}