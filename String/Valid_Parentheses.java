package String;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/1709811022/
//557
public class Valid_Parentheses {
    public static void main(String[] args) {
        String s = "hello world";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        String [] words=s.split(" ");
        StringBuilder result=new StringBuilder();

        for(String word:words){
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return new String(result).trim();
    }
    }


