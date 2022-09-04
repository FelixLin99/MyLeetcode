package String;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/9/4 1:41
 */
public class NumOfConnextedGraphs {
    private static boolean[] visited;
    private static LinkedList<Integer>[] ll;
    private static void dfs(int i){
        if (ll[i] == null){
            return;
        }
        for (Integer neighbor: ll[i]){
            if (!visited[neighbor]){
                visited[neighbor] = true;
                dfs(neighbor);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int pairNum = Integer.parseInt(sc.nextLine());
        visited = new boolean[n];

        // initialize the graph
        ll = new LinkedList[n];
        for (int i = 0; i < pairNum; i++){
            String[] tmp = sc.nextLine().split(" ");
            if (ll[Integer.parseInt(tmp[0])] == null){
                ll[Integer.parseInt(tmp[0])] = new LinkedList<Integer>();
            }
            ll[Integer.parseInt(tmp[0])].add(Integer.parseInt(tmp[1]));
        }

        int cnt = 0;
        //
        for (int i = 0; i < n; i++){
            if (!visited[i]){
                visited[i] = true;
                cnt++;
                dfs(i);
            }
        }
        System.out.println(cnt);
    }
}
