package StackAndQueue;

public class Remove_Outermost_Parantheses {
    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
    }

    public static String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int balance=0;

        for(char c:s.toCharArray()) {
            if (c == '(') {
                if (balance > 0) {
                    result.append(c);
                }
                balance++;
            } else {
                balance--;

                if (balance > 0) {
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}
