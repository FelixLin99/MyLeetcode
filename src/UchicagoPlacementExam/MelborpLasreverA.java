package UchicagoPlacementExam;

import java.util.Scanner;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/9/3 23:09
 */
public class MelborpLasreverA {

    private static String reverseStr(String s){
        if (s.length() == 1){
            return s;
        }
        return reverseStr(s.substring(1, s.length())) + s.substring(0, 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(reverseStr(s));

    }
}
