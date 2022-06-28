package Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/22 14:43
 */
public class KthSmallestElementinaSortedMatrix_Medium_378 {

    //     public int kthSmallest(int[][] matrix, int k) {
//         // priority queue
//         int n = matrix.length;
//         PriorityQueue<int[]> heap = new PriorityQueue<>(new MyComparator());
//         for (int i = 0; i < n; i++){
//             heap.add(new int[]{matrix[i][0], i, 0});
//         }
//         for (int i = 0; i < k-1; i++){
//             int[] min = heap.poll();
//             if (min[2] < n-1){
//                 heap.add(new int[]{matrix[min[1]][min[2]+1], min[1], min[2]+1});
//             }
//         }
//         return heap.poll()[0];
//     }

//     private class MyComparator implements Comparator<int[]>{
//         @Override
//         public int compare(int[] o1, int[] o2){
//             return o1[0] - o2[0];
//         }
//     }

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length, output = -1;
        int left = matrix[0][0], right = matrix[n-1][n-1];
        while (left <= right){
            int mid = left + (right-left)/2;
            int cnts = lessOrEqualThan(mid, matrix);
            if (cnts < k){
                left = mid+1;
            }
            else{
                output = mid;
                right = mid-1;
            }
        }
        return left;

    }

    private int lessOrEqualThan(int num, int[][] matrix) {
        int n = matrix.length, cnts = 0;
        int r = 0, c = n - 1;
        while (r < n && c >= 0) {
            if (matrix[r][c] <= num) {
                cnts += c + 1;
                r++;
            } else {
                c--;
            }
        }


        return cnts;
    }

}
