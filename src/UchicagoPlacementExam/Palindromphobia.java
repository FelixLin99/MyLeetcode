package UchicagoPlacementExam;

import java.util.Scanner;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/9/4 6:10
 */
public class Palindromphobia {
    private static boolean isPalindrome(String input){
        int n = input.length();
        if (n == 1){
            return true;
        }
        if (n == 2){
            return input.charAt(0) == input.charAt(1);
        }
        return input.charAt(0)==input.charAt(n-1) && isPalindrome(input.substring(1,n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if (isPalindrome(input)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
