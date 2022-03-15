package Tree.Problem;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/15 13:49
 */
public class ImplementTriePrefixTree_Medium_208 {
    private class Node{
        private Node[] children;
        private boolean exists;
        Node(){
            this.children = null;
            this.exists = false;
        }
        Node(int t){
            this.children = new Node[t];
            this.exists = false;
        }
    }

    private Node root;

    public ImplementTriePrefixTree_Medium_208() {
        root = new Node(26);
    }

    public void insert(String word) {
        Node tmp = root;
        for(int i = 0; i< word.length(); i++) {
            int loc = word.charAt(i) - 'a';
            if (tmp.children[loc] == null) {
                tmp.children[loc] = new Node(26);
            }
            tmp = tmp.children[loc];
        }
        tmp.exists = true;
    }

    public boolean search(String word) {
        Node tmp = root;
        for(int i = 0; i<word.length(); i++){
            int loc = word.charAt(i) - 'a';
            if (tmp.children[loc] != null){
                tmp = tmp.children[loc];
            }
            else{
                return false;
            }
        }
        if (tmp.exists == false){
            return false;
        }
        return true;
    }

    public boolean startsWith(String prefix) {
        Node tmp = root;
        for(int i = 0; i<prefix.length(); i++){
            int loc = prefix.charAt(i) - 'a';
            if (tmp.children[loc] != null){
                tmp = tmp.children[loc];
            }
            else{
                return false;
            }
        }
        return true;

    }
}
