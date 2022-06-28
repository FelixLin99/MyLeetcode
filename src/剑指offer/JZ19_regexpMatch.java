package 剑指offer;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/6/24 18:16
 */
public class JZ19_regexpMatch {
    public  boolean match (String str, String pattern) {
        // write code here
        int strPointer = 0, patPointer = 0;
        while(strPointer < str.length() && patPointer < pattern.length()) {
            if (pattern.charAt(patPointer) == '.' || str.charAt(strPointer) == pattern.charAt(patPointer)) {
                if (patPointer + 1 < pattern.length() && pattern.charAt(patPointer + 1) == '*') {
                    strPointer++;
                    while (strPointer + 1 < str.length()) {
                        if (str.charAt(strPointer + 1) != str.charAt(strPointer)) {
                            break;
                        }
                        strPointer++;
                    }
                    patPointer += 2;
                    continue;
                }
                // pattern.charAt(patPointer+1)!='*'
                strPointer++;
                patPointer++;
                continue;
            }
            if (patPointer+1 < pattern.length() && pattern.charAt(patPointer+1)=='*'){
                patPointer+=2;
                continue;
            }else{
                // pattern[patPointer] != str[strPointer] && (patPointer == pattern.length-1 || pattern[patPointer+!] != '*')
                break;
            }
        }

        if (strPointer == str.length()){
            if (patPointer == pattern.length()){
                return true;
            }
            String tail = pattern.substring(patPointer);
            if (tail.length() % 2 == 0){
                for (int i = 1; i < tail.length(); i+=2){
                    if (tail.charAt(i) != '*'){
                        return false;
                    }
                }
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
