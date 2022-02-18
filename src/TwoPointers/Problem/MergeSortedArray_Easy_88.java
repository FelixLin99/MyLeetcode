package TwoPointers.Problem;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/1821:11
 */
class MergeSortedArray_Easy_88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // fill in num from the last
        for(int i = nums1.length-1; i>=0 && n >=1; i--){
            if (m <= 0 || nums2[n-1] >= nums1[m-1]){
                nums1[i] = nums2[n-1];
                n--;
            }
            else{
                nums1[i] = nums1[m-1];
                m--;
            }
        }
    }
}
