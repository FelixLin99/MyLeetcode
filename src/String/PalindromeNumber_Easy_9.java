package String;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/18 12:07
 */
public class PalindromeNumber_Easy_9 {
    public static boolean isPalindrome(int x) {
        if (x != 0 && x < 0 || x % 10 == 0){
            return false;
        }
        int reverse = 0;
        while ( x > reverse){
            reverse = reverse*10 + x % 10;
            x = x / 10;
        }
        if (reverse > x){
            return (reverse / 10) == x;
        }
        return reverse == x;
    }

    public static void main(String[] args) {
        isPalindrome(0);
    }

}

