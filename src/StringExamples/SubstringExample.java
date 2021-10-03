package StringExamples;

public class SubstringExample {
    public static void main(String args[]) {
        // prints the substring after index 8 till index 17
        String str = "LazyyFroggJumpsRiverLazyy";
        String substr = str.substring(8, 17);

        System.out.println("substring = " + substr);

// prints the substring after index 0 till index 8

        substr = str.substring(0, 8); //start pos is inclusive , end is  exclusive i.e it lastindex -1

        System.out.println("substring = " + substr);

        substr = str.substring(0); //till end of string

        System.out.println("substring = " + substr);
    }
}
