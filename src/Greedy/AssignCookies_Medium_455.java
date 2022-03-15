package Greedy;

import java.util.Arrays;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/15 19:28
 */
public class AssignCookies_Medium_455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int pointG = 0, pointS = 0;
        while (pointG < g.length && pointS < s.length) {
            if(g[pointG] > s[pointS]){
                pointS++;
            }
            else{
                pointG++;
                pointS++;
            }
        }
        return pointG;
    }
}
