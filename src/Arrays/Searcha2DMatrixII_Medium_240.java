package Arrays;

import java.util.HashSet;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/21 16:20
 */
public class Searcha2DMatrixII_Medium_240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int curRow = 0, curCol = n-1;
        while(curRow < m && curCol >=0){
            if (matrix[curRow][curCol] == target){
                return true;
            }
            if (matrix[curRow][curCol] > target){
                curCol--;
            } else{
                curRow++;
            }
        }
        HashSet<Integer> integers = new HashSet<>();

        return false;
    }
}
