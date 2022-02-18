package TwoPointers.Problem;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/2/1820:19
 */
public class ValidPalindrome_Medium_680 {
    public static boolean validPalindrome(String s) {
        int i = 0, j = s.length()-1;
        boolean hasDeleted = false;
        while (i<j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (hasDeleted && a!=b){
                return false;
            }
            if (!hasDeleted && a!=b){
                if(i+1 == j){
                    return true;
                }
                if(s.charAt(i+1) != s.charAt(j) && s.charAt(i) != s.charAt(j-1)){
                    return false;
                }
                if (s.charAt(i+1) == s.charAt(j)){
                    i+=2;
                    j--;
                } else if (s.charAt(i) == s.charAt(j-1)){
                    j -= 2;
                    i++;
                }
                hasDeleted = true;
            } else{
                i++;
                j--;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        String a =
                "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        validPalindrome(a);
        System.out.println(validPalindrome(a));
    }
}
