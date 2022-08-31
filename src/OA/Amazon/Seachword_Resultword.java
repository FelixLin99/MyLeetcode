package OA.Amazon;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/8/30 16:11
 */
public class Seachword_Resultword {

    private static int helper(String searchword, String resultword){
        int searchIdx = 0, resultIdx = 0;
        while(searchIdx < searchword.length() && resultIdx < resultword.length()){
            if(searchword.charAt(searchIdx) == resultword.charAt(resultIdx)){
                resultIdx++;
            }
            searchIdx++;
        }
        return (resultIdx==resultword.length())? 0 : resultword.length() - resultIdx;
    }
    public static void main(String[] args) {

    }
}
