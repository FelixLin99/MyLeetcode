package Sorting;

import java.util.PriorityQueue;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description:
 * @date 2022/3/18 16:40
 */
public class KthLargestElementinanArray_Medium_215 {
    // // quickSort O(NlogN)
    // public int findKthLargest(int[] nums, int k) {
    //     Arrays.sort(nums);
    //     return nums[nums.length-k];
    // }

    // heapSort
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        return -1;
    }

//     // quick select, which is the most beautiful one.
//     public int findKthLargest(int[] nums, int k) {
//         k = nums.length - k;
//         int l = 0, h = nums.length - 1;
//         while(l <= h){
//             int loc = partition(nums,l,h);
//             if (loc == k){
//                 return nums[k];
//             } else if (loc > k){
//                 h = loc - 1;
//             } else {
//                 l = loc + 1;
//             }
//         }
//         return -1;
//     }

//     private int partition(int[] nums, int low, int high){
//         int pivot = nums[high];
//         int i = low;
//         for(int j = low; j<= high; j++){
//             if (nums[j] <= pivot){
//                 swap(nums, i++, j);
//             }
//         }
//         return i-1;
//     }
//     private void swap(int[] nums, int loc1, int loc2){
//         int tmp = nums[loc1];
//         nums[loc1] = nums[loc2];
//         nums[loc2] = tmp;
//     }

}
