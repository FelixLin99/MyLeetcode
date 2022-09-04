package String;

import java.util.Arrays;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/9/4 16:56
 */
public class KMP {

    private static int[] getPrefixTable(int[] arr){
        int n = arr.length;
        int[] prefixTable = new int[n];
        // init
        prefixTable[0] = 0;
        // assign
        for(int i = 1; i < n; i++){
            int prefixLen = prefixTable[i-1];
            while (prefixLen >= 0) {
                if (arr[prefixLen] == arr[i]){
                    prefixTable[i] = prefixLen+1;
                    break;
                }
                else{
                    if (prefixLen == 0){
                        break;
                    }
                    prefixLen = prefixTable[prefixLen-1];
                }
            }
        }

        return prefixTable;
    }

    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,1,2,1,2,3,3,1,3,1};
        int[] prefixTable = getPrefixTable(test);
        System.out.println(Arrays.toString(prefixTable));


    }
}
