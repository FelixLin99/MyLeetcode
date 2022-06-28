package 剑指offer;

import java.util.Scanner;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: print from 1 to 10^n; n can be too large to use INT or LONGINT to store
 * @date 2022/6/24 17:10
 */
public class printFrom1ToN {

    private static int pointer = 0; // where I should add the new one to?

    public static void main(String[] args) {
        String num = "1";
        int n = 5;
        while(num.length() <= n){
            System.out.println(num);
            if(pointer >= num.length()){
                num = "1" + num.replaceAll("9","0");
                pointer = 0;
            }
            else if(pointer == 0){
                num = num.substring(0,num.length()-1) + Integer.toString(Integer.parseInt(num.substring(num.length()-1))+1);
                int tmp = 0;
                for (; tmp <num.length(); tmp++){
                    if (num.charAt(num.length() - 1 - tmp) != '9'){
                        break;
                    }
                }
                pointer = tmp;
            }
            else{
                String head = num.substring(0, num.length() - pointer);
                String tail = num.substring(num.length() - pointer);
                tail = tail.replaceAll("9","0");
                head = head.substring(0, head.length()-1) + Integer.toString(Integer.parseInt(head.substring(head.length()-1))+1);
                num = head + tail;
                pointer = 0;
            }

        }
    }

}
