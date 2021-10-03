// Java program to print table
// of a number using recursion
class RecursionExample2 {

    // Function that print the
    // table of a given number
    // using recursion
    static void mul_table(int N, int i)
    {
        // Base Case
        if (i > 10)

            return;


        // Print the table for
        // current iteration
        System.out.println(N + " * " + i + " = " + N * i);

        // Recursive call to next
        // iteration
        mul_table(N, i + 1);
    }

    // Driver Code
    public static void main (String[] args)
    {
        // Input number whose table
        // is to print
        int Table = 8;

        // Function call to print
        // the table
        mul_table(Table, 1);
    }
}
