package Hemanth;

//https://leetcode.com/problems/reshape-the-matrix/description/
//566

import java.util.Arrays;

public class Reshape_The_Matrix {
    public static void main(String[] args) {
        int [][] mat={{1,2},{3,4}};
        System.out.println(Arrays.deepToString(matrixReshape(mat,1,4)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {

        int m=mat.length;
        int n=mat[0].length;

        if(m*n != r*c){
            return mat;
        }

        int[][] result = new int[r][c];

        for (int i = 0; i < m*n; i++) {

                result[i/c][i%c] = mat[i/n][i%n];

        }
        return result;
    }

}