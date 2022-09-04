package UchicagoPlacementExam;

import java.util.Scanner;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/9/3 21:39
 */
public class CalenderConundrum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        if (a > 31){
            System.out.println("Format #1");
        }
        else if (a > 12 && a <= 31){
            if (c > 31){
                System.out.println("Format #2");
            }
            else{
                System.out.println("Ambiguous");
            }
        }
        else{
            if (b > 12){
                System.out.println("Format #1");
            }
            else{
                System.out.println("Ambiguous");
            }
        }
    }
}
