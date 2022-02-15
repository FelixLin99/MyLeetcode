package LinkedList.DataStructure;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/150:38
 */
public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }
    public ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    public void addNode(int val){
        ListNode nextNode = new ListNode(val);
        ListNode backup = this;
        while(backup.next != null){
            backup = backup.next;
        }
        backup.next = nextNode;
    }

    public boolean isEmpty(){
        return this == null;
    }

    public String toString(){
        if (this == null){
            return null;
        }
        String output = "";
        ListNode tmp = this;
        while(tmp.next != null){
            output = output + Integer.toString(tmp.val) + " ";
            tmp = tmp.next;
        }
        output += Integer.toString(tmp.val);
        return output;

    }
}
