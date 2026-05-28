package Hemanth.String;

public class Last_Word_Length {


    public static void main(String[] args) {
        String name="   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(name));
    }
    public static int lengthOfLastWord(String s) {
        s=s.trim();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            char value=s.charAt(i);
            if(value!=' '){
                count++;
            } else{
                break;
            }
        } return count;
    }
}
