package TwoPointers.Problem;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/1717:09
 */
public class ReverseVowelsOfAString_Easy_345 {
    public static String reverseVowels(String s){
        int i = 0, j = s.length()-1;
        HashSet<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        char[] output = new char[s.length()];
        while(i<=j){
            char char1 = s.charAt(i);
            char char2 = s.charAt(j);
            if (!vowels.contains(char1)){
                output[i++] = char1;
            }
            else if (!vowels.contains(char2)){
                output[j--] = char2;
            }
            else{
                output[j--] = char1;
                output[i++] = char2;
            }
        }
        return new String(output);
    }


    public static void main(String[] args) {
        String test = "hello";
        String s = reverseVowels(test);
        System.out.println(s);


    }


}
