package Hemanth.StackAndQueue;

//https://leetcode.com/problems/valid-parentheses/description/
//20

import java.util.Stack;

public class Valid_Parentheses {
    public static void main(String[] args) {
        System.out.println(isValid("()"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();

        for (char ch:s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else {
                if (ch==')'){
                    if (stack.isEmpty() ||stack.pop()!='(' ){
                        return false;
                    }
                }

                if (ch=='}'){
                    if (stack.isEmpty()||stack.pop()!='{'){
                        return false;
                    }
                }

                if (ch==']'){
                    if (stack.isEmpty()||stack.pop()!='['){
                        return false;
                    }
                }
            }
        } return stack.isEmpty();
    }
}
