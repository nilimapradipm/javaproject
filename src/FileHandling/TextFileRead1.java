package FileHandling;



import java.io.FileReader;
import java.io.IOException;


public class TextFileRead1 {

    public static void main(String[] args) {

        try {


            FileReader reader = new FileReader("./MyFile.txt");

            int ch;

            while ((ch = reader.read()) != -1) {
               // System.out.print((char)ch);
                System.out.print((char)ch);
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();

        }


    }


}


