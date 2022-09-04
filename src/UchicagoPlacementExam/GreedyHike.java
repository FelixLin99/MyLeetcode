package UchicagoPlacementExam;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/9/3 22:37
 */
public class GreedyHike {
    private static String helper(int x, int y, int[][] chess){
        int cols = chess[0].length;
        int rows = chess.length;
        int preX = x, preY = y;
        int E = 0;
        for (int col = y+1; col <= cols; col++){
            int diffA,diffB,diffC;
            diffB = Math.abs(chess[preX][col] - chess[preX][col-1]);
            if (preX == 1){
                diffA = Integer.MAX_VALUE;
                diffC = Math.abs(chess[preX+1][col] - chess[preX][col-1]);
            }
            else if (preX == rows){
                diffC = Integer.MAX_VALUE;
                diffA = Math.abs(chess[preX-1][col] - chess[preX][col-1]);
            }
            else{
                diffA = Math.abs(chess[preX-1][col] - chess[preX][col-1]);
                diffC = Math.abs(chess[preX+1][col] - chess[preX][col-1]);
            }
            //
            if (diffA < diffC && diffA < diffB){
                preX--;
                E += diffA;
            }
            else if (diffB < diffC && diffB < diffA){
                E += diffB;
            }
            else if (diffC < diffA && diffC < diffB){
                preX++;
                E += diffC;
            }
            else if (diffA == diffB || diffC == diffB){
                E += diffB;
            }
            else{
                preX++;
                E += diffC;
            }
        }
        return String.valueOf(preX) + " " + String.valueOf(cols) + " " + String.valueOf(E);

    }

    public static void main(String[] args) {

    }

}
