package OA.Amazon;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/8/30 16:39
 */
public class Move_Locations {

    private int[] helper(int[] locations, int[] moveFrom, int[] moveTo){
        HashSet<Integer> set = new HashSet<>();
        for(int loc: locations){
            set.add(loc);
        }

        for(int i = 0; i < moveFrom.length; i++){
            set.remove(moveFrom[i]);
            set.add(moveTo[i]);
        }

        int idx = 0;
        for(Integer i: set){
            locations[idx++] = i;
        }

        Arrays.sort(locations);
        return locations;

    }
    public static void main(String[] args) {

    }
}
