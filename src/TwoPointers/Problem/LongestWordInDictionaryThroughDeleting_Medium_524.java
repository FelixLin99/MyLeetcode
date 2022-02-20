package TwoPointers.Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoubleToLongFunction;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/2/1821:50
 */
public class LongestWordInDictionaryThroughDeleting_Medium_524 {
    public static String findLongestWord(String s, List<String> dictionary) {
        String out = "";
        for (String word : dictionary){
            if (word.length() > out.length() && containWord(s, word)){
                out = word;
            }
            if (word.length() == out.length() && out.compareTo(word)<0 && containWord(s, word)){
                out = word;
            }
        }
        return out;
    }

    public static boolean containWord(String s, String word){
        int startLoc = 0;
        for (int i = 0; i<word.length(); i++){
            String substring = s.substring(startLoc);
            int tmp = substring.indexOf(word.charAt(i));
            if (tmp == -1) {
                return false;
            }
            startLoc = startLoc + tmp + 1;
        }
        return true;

    }

    public static void main(String[] args) {
        List<String> dictionary = new ArrayList<>();
        dictionary.add("ale");
        dictionary.add("apple");
        dictionary.add("monkey");
        dictionary.add("plea");
        String s = "abpcplea";
        String longestWord = findLongestWord(s, dictionary);
        System.out.println(longestWord);
    }
}
