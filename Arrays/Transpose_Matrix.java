package Hemanth;
//https://leetcode.com/problems/transpose-matrix/
//867
import java.util.Arrays;

public class Transpose_Matrix {
    public static void main(String[] args) {
        int [][] nums={{1,2,3},
                {4,5,6}
        };
        System.out.println((Arrays.deepToString(transpose(nums))));
    }
    public static int[][] transpose(int[][] matrix) {
        int [] []mat=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                mat[j][i]=matrix[i][j];
            }
        }return mat;
    }
}
