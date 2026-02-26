package Hemanth;

//1108

public class IP_Address {
    public static void main(String[] args) {
        String a = "HELLO";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch == '.') {
                result.append("[.]");
            } else result.append(ch);
        }
        System.out.println(result.toString());

    }
}
