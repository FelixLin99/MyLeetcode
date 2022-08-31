package OA.Amazon;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/8/30 22:19
 */
public class Greyness {
    private static int helper (String[] input){
        int rowCnt = input.length;
        int colCnt = input[0].length();
        int[] ithRowSum = new int[rowCnt];
        int[] ithColSum = new int[colCnt];
        int res = Integer.MIN_VALUE;


        for(int i = 0; i < rowCnt; i++){
            for(int j = 0; j < colCnt; j++){
                ithRowSum[i] += Integer.parseInt(input[i].substring(j, j+1));
                ithColSum[j] += Integer.parseInt(input[i].substring(j, j+1));
            }
        }

        for(int i = 0; i < rowCnt; i++) {
            for (int j = 0; j < colCnt; j++) {
                int blackCnt = (input[i].charAt(j) == '0')? ithRowSum[i] + ithColSum[j] : ithRowSum[i] + ithColSum[j] - 1;
                // black-white = black-(n+m-1-black) = 2*black+1+m-n =
                res = Integer.max(res, 2*blackCnt+1+colCnt-rowCnt);
            }
        }

        return res;
    }


    public static void main(String[] args) {

    }
}
