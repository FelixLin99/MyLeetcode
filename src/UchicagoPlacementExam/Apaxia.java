package UchicagoPlacementExam;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/9/3 23:02
 */
public class Apaxia {


    private static String getNobleName(String firstName, String lastName){
        int len = lastName.length();
        String original = String.copyValueOf(lastName.toCharArray());
        len = (len == 5)? 4: len;
        for (int i = 1; i < len; i++){
            lastName += original;
        }
        return firstName + " " + lastName;
    }


    public static void main(String[] args) {

    }


}
