package String;

//https://leetcode.com/problems/valid-palindrome/description/
//125



public class Palindrome {
    public static void main(String[] args) {
        System.out.println(reverseString("hi"));
//        String str= "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(str));
//    }
//    public static boolean isPalindrome(String s) {
//        String S=s.toLowerCase();
//        String str1=S.replaceAll(" ","");
//        String str2=str1.replaceAll("[:,]","");
//        for(int i=0;i<str2.length()/2;i++){
//            char start=str2.charAt(i);
//            char end=str2.charAt(str2.length()-1-i);
//            if(start!=end){
//                return false;
//            }
//        }
//        return true;
    }
        public static String reverseString(String s) {
            // code here
            StringBuilder result=new StringBuilder();

            for(int i=s.length()-1;i>=0;i--){
                result.append(s.charAt(i));
            }
            return new String(result);
        }

}
