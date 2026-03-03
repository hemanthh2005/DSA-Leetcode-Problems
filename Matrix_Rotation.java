package Hemanth;

//https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation/description/
//1886


import java.util.Arrays;

public class Matrix_Rotation {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};

//        int [][] mat={{0,1},{1,0}};
//        int [][] target={{1,0},{0,1}};
        System.out.println(findRotation(mat, target));
    }

    public static boolean findRotation(int[][] mat, int[][] target) {


        int n = mat.length;
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            mat = rotate90(mat);
        }
        return false;
    }

    private static int[][] rotate90(int[][] mat) {
        int n = mat.length;
        int[][] matrix = new int[mat.length][mat[0].length];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                matrix[j][n - 1 - i] = mat[i][j];
            }
        }
        return matrix;
    }

}






