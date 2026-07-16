package Hemanth.Recursion;

import java.util.Arrays;

public class Reverse_String {
    public static void main(String[] args) {
        char [] s={'h','e','l','l','o'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public static void reverseString(char[] s) {
            helper(s,0);
        }

    private static void helper(char[] s, int left) {
        int right=s.length-1-left;
        if(left>=right){
            return;
        }
        char temp=s[right];
        s[right]=s[left];
        s[left]=temp;

        helper(s,left+1);
    }

}



