package Arrays;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/21 14:27
 */
public class ReshapetheMatrix_Easy_566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m*n != r*c){
            return mat;
        }
        int[][] reshapedMat = new int[r][c];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                int curRow = (i*n + j) / c;
                int curCol = (i*n + j) - curRow*c;
                reshapedMat[curRow][curCol] = mat[i][j];
            }
        }
        return reshapedMat;
    }
}
