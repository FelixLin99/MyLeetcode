package Greedy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/16 22:12
 */
public class PartitionLabels_Medium_763 {
    public static List<Integer> partitionLabels(String s) {

        List<Integer> output = new ArrayList<>();
        output.add(1);
        for (int i = 1; i < s.length(); i++){
            char curChar = s.charAt(i);
            int loc = s.substring(0, i).indexOf(curChar);
            if (loc == -1){ // curChar hasn't appeared
                output.add(1);
            }
            else{
                // to find the part that s.charAt(loc) belongs to
                int curLoc = -1;
                int j;
                for (j = 0; j < output.size(); j++){
                    curLoc += output.get(j);
                    if (curLoc >= loc){
                        break;
                    }
                }
                output = (List<Integer>) output.subList(0, j+1);
                output.set(j,i - curLoc + output.get(j));
            }
        }
        return output;
    }

    public static void main(String[] args) {
        partitionLabels(
                "ababcbacadefegdehijhklij");
    }
}
