package Hemanth.StackAndQueue;

//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
//1047

import java.util.Stack;

public class Remove_Adjacent_Duplicates_String {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
    }

    public static String removeDuplicates(String s) {

        Stack<Character> result=new Stack();

        for (int i = 0; i < s.length(); i++) {

            char c=s.charAt(i);
            if(!result.isEmpty() && result.peek()==c){
                result.pop();
            }
            else{
                result.push(c);
            }
        }

        StringBuilder answer=new StringBuilder();

        for (char c:result){
         answer.append(c);
        }

        return answer.toString();
    }
}
