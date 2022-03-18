package String;

import java.util.Arrays;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/17 23:30
 */
public class IsomorphicStrings_Easy_205 {

    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        int[] preT = new int[128];
        int[] preS = new int[128];
        Arrays.fill(preT, -1);
        Arrays.fill(preS, -1);
        for(int i = 0; i < s.length(); i++){
            if (preS[s.charAt(i)] == -1 && preT[t.charAt(i)] == -1){
                preS[s.charAt(i)] = i;
                preT[t.charAt(i)] = i;
            }
            else{
                if ( preS[s.charAt(i)] != preT[t.charAt(i)]){
                    return false;
                }
            }
        }
        return true;
    }
}
