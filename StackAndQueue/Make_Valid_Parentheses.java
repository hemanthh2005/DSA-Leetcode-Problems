package Hemanth.StackAndQueue;

import java.util.Stack;

public class Make_Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("(()))"));
    }

    public static int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();
        int count=0;

        for (char ch : s.toCharArray()) {
            if (ch == ')') {
                while (stack.peek() != '(') {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        count++;
                    }
                    else {
                        stack.push(ch);
                    }
                }
            }

             else{
                stack.push(ch);
            }

        }

        return count;
    }

}
