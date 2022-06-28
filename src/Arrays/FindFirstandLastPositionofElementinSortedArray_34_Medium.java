package Arrays;

/**
 * @author Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/6/28 23:17
 */
public class FindFirstandLastPositionofElementinSortedArray_34_Medium {
    public int[] searchRange(int[] nums, int target) {
        int head = 0, tail = nums.length-1;
        while(head <= tail){
            int mid = head + ((tail - head) >> 1);
            if(nums[mid] == target){
                // find startPoint
                int startPoint = findStartPoint(nums, head, mid, target);
                // find endPoint
                int endPoint = findEndPoint(nums, mid, tail, target);
                return new int[]{startPoint, endPoint};
            }
            if (nums[mid] < target){
                head = mid + 1;
            }
            else{
                tail = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    private int findStartPoint(int[] nums, int head, int tail, int target){
        while(head <= tail){
            int mid = (head + tail) / 2;
            if(nums[mid] >= target){ // normally can only be ==
                tail = mid - 1;
            }else{
                head = mid + 1;
            }
        }
        return tail + 1;
    }
    private int findEndPoint(int[] nums, int head, int tail, int target){
        while(head <= tail){
            int mid = (head + tail) / 2;
            if(nums[mid] <= target){ // normally can only be ==
                head = mid + 1;
            }else{
                tail = mid - 1;
            }
        }
        return head - 1;
    }
}
