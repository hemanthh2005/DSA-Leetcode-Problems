package Recursion;

//https://leetcode.com/problems/power-of-three/description/
//326

public class Pow_of_Three {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(27));
    }
    public static boolean isPowerOfThree(int n) {
        if (n > 0) {
        return helper(n,0);}

        return false;
    }

    private static boolean helper(int n, int i) {
        double power=Math.pow(3,i);
        if(n == power) {
            return true;
        }
        if (power>n){return false;}

        return helper(n,i+1);
    }
}
