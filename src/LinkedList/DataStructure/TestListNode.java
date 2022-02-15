package LinkedList.DataStructure;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/1518:51
 */
public class TestListNode {
    public static void main(String[] args) {
        int bin = 0;
        int k = 4;
        int length = 14;
        for(int i = k; i > 0; i--){
            length -= bin;
            bin = (int) Math.ceil((double)length/i);
            System.out.println(bin);
        }

    }
}
