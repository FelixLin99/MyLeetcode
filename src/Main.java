import java.io.InputStream;
import java.sql.Array;
import java.util.*;

class Main {
    private static int[] getNextArr(String needle){
        int currPreFixEndPoint = -1, currSuffixEndPoint = 0;
        int[] next = new int[needle.length()];
        for(int i = 1; i < needle.length(); i++){
            if(needle.charAt(currPreFixEndPoint+1) == needle.charAt(i)){
                currPreFixEndPoint++;
                next[i] = currPreFixEndPoint+1;
            }
            else{
                while(currPreFixEndPoint!= -1 && needle.charAt(currPreFixEndPoint+1) != needle.charAt(i)){
                    currPreFixEndPoint = next[currPreFixEndPoint]-1;
                }
                next[i] = currPreFixEndPoint+1;
            }
        }
        return next;
    }


    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        System.out.println(123);
        while(!sc.hasNext("123")){
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}