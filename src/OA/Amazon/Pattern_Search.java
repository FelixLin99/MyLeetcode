package OA.Amazon;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/8/31 12:17
 */
public class Pattern_Search {

    private static int helper(String log, String target){
        int[] set = new int[26];
        int[] targetSet = new int[26];
        int res = Integer.MAX_VALUE;

        for(char c: log.toCharArray()){
            set[c-'a']++;
        }

        for (char c: target.toCharArray()){
            targetSet[c-'a']++;
        }

        for(int i =0; i < 26; i++){
            if(targetSet[i] > 0){
                res = Integer.min(res, set[i] / targetSet[i]);
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int res = helper("monononononmmontts","mon");
        System.out.println(res);

    }
}
