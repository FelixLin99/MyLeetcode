package OA.Amazon;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/9/15 21:35
 */
public class SimilarPassword {

    private static String[] getAns(String[] newPwd, String[] oldPwd){
        int n = newPwd.length;
        String[] res = new String[n];
        for(int i = 0; i < n; i++){
            String newP = newPwd[i];
            String oldP = oldPwd[i];
            int newIdx = 0, oldIdx = 0;

            while(newIdx < newP.length() && oldIdx < oldP.length()){
                if(checkSimilar(newP.charAt(newIdx), oldP.charAt(oldIdx))){
                    oldIdx++;
                }
                newIdx++;
            }
            res[i] = (oldIdx == oldP.length())? "YES": "NO";
        }
        return res;


    }

    private static boolean checkSimilar(char newC, char oldC){
        return (oldC - newC + 26) % 26 <= 1;
    }

    public static void main(String[] args) {
        String[] ans = getAns(new String[]{"baacbab", "accdb", "baacba"}, new String[]{"abdbc", "ach", "abb"});
        for (String s: ans){
            System.out.println(s);;
        }

    }




}
