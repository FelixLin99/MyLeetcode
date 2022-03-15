package Tree.Problem;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/15 14:21
 */
public class MapSumPairs_Medium_677 {
    private class Node{
        private Node[] children;
        private int val;
        private int sumOfAllOffsprings;
        Node(){
            children = null;
            val = 0;
            sumOfAllOffsprings = 0;
        }
        Node(int t){
            children = new Node[t];
            val = 0;
            sumOfAllOffsprings = 0;
        }

    }

    private Node root;

    public MapSumPairs_Medium_677() {
        root = new Node(26);
    }

    public void insert(String key, int val) {
        Node tmp = root;
        for(int i = 0; i< key.length(); i++){
            int loc = key.charAt(i) - 'a';
            if (tmp.children[loc] == null){
                tmp.children[loc] = new Node(26);
            }
            tmp = tmp.children[loc];
            tmp.sumOfAllOffsprings += val;
        }
        if (tmp.val != 0){
            int preVal = tmp.val;
            tmp = root;
            for(int i = 0; i< key.length(); i++){
                int loc = key.charAt(i) - 'a';
                tmp = tmp.children[loc];
                tmp.sumOfAllOffsprings -= preVal;
            }
        }
        tmp.val = val;
    }

    public int sum(String prefix) {
        Node tmp = root;
        for(int i = 0; i< prefix.length(); i++){
            int loc = prefix.charAt(i) - 'a';
            if (tmp.children[loc] == null){
                return 0;
            }
            tmp = tmp.children[loc];
        }
        return tmp.sumOfAllOffsprings;
    }
}
