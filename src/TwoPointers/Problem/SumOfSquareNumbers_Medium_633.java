package TwoPointers.Problem;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * * @date 2022/2/1716:38
 */
public class SumOfSquareNumbers_Medium_633 {
    // My first solution, which is too slow!!!
    public static boolean judgeC (long c){
        if (c == 0){
            return true;
        }

        double sqrt = Math.sqrt(c);
        double sqrtHalf = Math.sqrt((double)c/2);
        long ceilA = (long)Math.floor(sqrt);
        long floorA = (long)Math.ceil(sqrtHalf);
        if (sqrt % ceilA == 0 || sqrtHalf % floorA == 0){
            return true;
        }

        for(long a = ceilA; a >= floorA; a-- ){
            for (long b = 1; b*b + a*a <= c; b++){
                if (b*b + a*a == c){
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean judgeSquareSum(int c){
        int j = (int)Math.sqrt(c);
        int i = 0;
        while(i <= j){
            int tmp = i*i + j*j;
            if (tmp == c){
                return true;
            }
            if (tmp > c){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // target find non=negative numbers c, and c = a^2 + b^2;
        // assumption: sqrt(c) >= a >= sqrt(c/2) >= b;
        int c1 = 0;
        long c2 = 1;
        long c3 = 2*2;
        long c4 = 81*81;
        long c5 = 1*1 + 9*9;
        long c6 = 5*5 + 107*107 + 1;
        long c7 = 2147483640;
        System.out.println(judgeSquareSum(c1));
        System.out.println(judgeC(c2));
        System.out.println(judgeC(c3));
        System.out.println(judgeC(c4));
        System.out.println(judgeC(c5));
        System.out.println(judgeSquareSum((int) c6));
        System.out.println(judgeSquareSum((int) c7));

    }
}
