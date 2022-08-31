package OA.Amazon;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/8/30 15:28
 */
public class Key_Pad {


    private static int helper(String str){
        Integer[] map= new Integer[26];
        Arrays.fill(map, 0);
        for(char c: str.toCharArray()){
            map[c-'a']++;
        }
        Arrays.sort(map, (o1,o2) ->{
            return o2-o1;
        });

        int res = 0;
        for(int i = 0; i < 26 && map[i] > 0; i++){
            res += (i/9 + 1) * map[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int res = helper("abcdefghiabcdefghijjj");
        System.out.println(res);
    }
}
