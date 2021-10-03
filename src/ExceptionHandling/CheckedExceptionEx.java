package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionEx {

    public static void main (String[] args) throws FileNotFoundException {
        FileReader f = new FileReader("./output1.txt");
        System.out.println("Handled Exception");
    }
}
