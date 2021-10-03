//package FileHandling;
//
//
//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.FileReader;
//import java.io.IOException;
//
//
//public class ReadFile {
//
//    public static void main(String[] args) {
//        try {
//            FileInputStream fin = new FileInputStream("./MyFile.txt");
//            int ch  ;
//            // fin.read ->  read character in ascii form & return -1 at the end of file
//            while ((ch= fin.read()) != -1)
//            {
//                System.out.print((char)ch);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//}
//
