package OA.Amazon;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/9/13 21:26
 */
public class RemoveObstacle {

    private static int removeObstacle(int[][] grip){
        // bfs with O(n*n) tine complexity
        int rows = grip.length;
        int cols = grip[0].length;
        int[][] visited = new int[rows][cols];;
        LinkedList<int[]> s = new LinkedList<>();
        //init
        s.addLast(new int[]{0,0});
        visited[0][0] = 1;

        int step = 0;
        while(s.size() > 0){
            int size = s.size();
            for(int i = 0; i < size; i++){
                int[] loc = s.removeFirst();

                int row = loc[0], col = loc[1];
                if (grip[row][col] == 9){
                    return step;
                }

                if(row > 0 && grip[row][col] == 1 && visited[row-1][col] == 0){
                    s.addLast(new int[]{row-1, col});
                }
                if(row < rows-1 && grip[row][col] == 1 && visited[row+1][col] == 0){
                    s.addLast(new int[]{row+1, col});
                }
                if(col > 0 && grip[row][col] == 1 && visited[row][col-1] == 0){
                    s.addLast(new int[]{row, col-1});
                }
                if(row < cols-1 && grip[row][col] == 1 && visited[row][col+1] == 0){
                    s.addLast(new int[]{row, col+1});
                }
            }

            step++;
        }

        return -1;



    }

    public static void main(String[] args) {

    }
}
