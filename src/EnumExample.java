

class EnumExample{
    enum Season { WINTER, SPRING, SUMMER, FALL }
    public static void main(String[] args) {

       // int n = 10;

        Season s = Season.SPRING;

        System.out.println(s);

        System.out.println("---------");

        for (Season s2 : Season.values())

        System.out.println(s2);

    }}


