package Collections;

import java.util.Stack;

public class StackDemo
{
    public static void main(String[] args)
    {
//creating an instance of Stack class
        Stack<Integer> stk= new Stack<>();
// checking stack is empty or not
        boolean result = stk.empty();
        System.out.println("Is the stack empty? " + result);
// pushing elements into stack
        stk.push(113);
        stk.push(null);
        stk.push(90);
        stk.push(90);
//prints elements of the stack
        System.out.println("Elements in Stack: " + stk);
        result = stk.empty();
        System.out.println("Is the stack empty? " + result);
        System.out.println("Poped Data? " + stk.pop());
        System.out.println("Peek Data? " + stk.peek());//top of stack with removing it

    }
}