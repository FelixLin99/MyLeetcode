package Graph;

import java.util.LinkedList;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/15 15:37
 */
public class IsGraphBipartite_Medium_785 {
    /**
     * BFS
     */
    public boolean isBipartite(int[][] graph) {
        int[] colors = new int[graph.length];
        for (int i = 0; i<colors.length; i++){
            if (colors[i] != 0){
                continue;
            }
            LinkedList<Integer> queue = new LinkedList<>();
            queue.addFirst(i);
            colors[i] = 1; //initialize with blue 1;

            while(!queue.isEmpty()){
                Integer curNode = queue.removeLast();
                for (int neighbor:graph[curNode]) {
                    if (colors[neighbor] == 0) {
                        colors[neighbor] = -colors[curNode];
                        queue.addFirst(neighbor);
                    } else {
                        if (colors[neighbor] != -colors[curNode]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }


    /**
     * DFS
     */
//    public boolean isBipartite(int[][] graph) {
//        // create an int[graph.length] to check every node in the graph is valid.
//        // DFS version
//        int[] colors = new int[graph.length];
//        for (int i = 0; i<colors.length; i++){
//            if(colors[i] == 0 && !isValid(graph, i, 1, colors)){
//                return false;
//            }
//            // set 1:blue as default color
//        }
//        return true;
//    }
//
//    private boolean isValid(int[][] graph, int curNode, int colorItShouldBe, int[] colors){
//        if (colors[curNode] != 0){
//            return colorItShouldBe == colors[curNode];
//        }
//        colors[curNode] = colorItShouldBe;
//        for(int neighbor : graph[curNode]){
//            if (!isValid(graph, neighbor, -colorItShouldBe, colors)){
//                return false;
//            }
//        }
//        return true;
//    }



}
