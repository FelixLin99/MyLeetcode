import java.io.InputStream;
import java.sql.Array;
import java.util.*;

class Main {    public boolean canFinish(int numCourses, int[][] prerequisites) {
    buildGraph(numCourses, prerequisites);

    // dfs
    for(int i = 0; i < numCourses; i++){
        if(!visited[i]){
            if(dfs(numCourses, i)){
                return true;
            }
        }
    }
    return false;

    // topo sorting

}

    private boolean[] visited;
    private boolean[] pathVisited;
    private LinkedList<Integer>[] graph;

    private void buildGraph (int numCourses, int[][] prerequisites){
        graph = new LinkedList[numCourses];
        for(int[] p: prerequisites){
            if(graph[p[0]] == null){
                graph[p[0]] = new LinkedList<Integer>();
            }
            graph[p[0]].addLast(p[1]);
        }
    }

    private boolean dfs (int numCourses, Integer course){
        pathVisited[course] = true;
        boolean res = false;
        for(Integer next: graph[course]){
            if(!visited[next]){
                if(pathVisited[next] || dfs(numCourses, next)){
                    return true;
                }
            }
        }
        visited[course] = true;
        pathVisited[course] = false;
        return false;
    }

    private boolean bfs(){
        return false;
    }

    public static void main(String args[] ) throws Exception {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.forEach(i ->{
            System.out.println(i);
        });

        HashMap<Integer, Integer> map = new HashMap<>();
        map.forEach((o1, o2) -> {

        });
        ArrayList<String> arr = new ArrayList<>();
        arr.sort((o1, o2) -> {
            return Integer.parseInt(o2)-Integer.parseInt(o1);
        });

        char a = 'a', b = 'b', z = 'z';
        System.out.println(z-0); // 'a' = 97, 'b' = 98 ... 'z' = 122
        System.out.println(('a' - 'z' +26 )% 26);

    }
}