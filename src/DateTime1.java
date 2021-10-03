

import java.time.LocalDate; // import the LocalDate class
import java.time.LocalTime;
import java.time.LocalDateTime;


class DateTime1
{
    public static void main(String[] args)
    {
        LocalDate myObj = LocalDate.now(); // Create a date object
        System.out.println(myObj); // Display the current date

        LocalTime myObj1 = LocalTime.now();
        System.out.println(myObj1); // Display the current time

        LocalDateTime myObj2 = LocalDateTime.now();
        System.out.println(myObj2); //  Display the current date & time


    }
}
