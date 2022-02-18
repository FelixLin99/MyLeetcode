package TwoPointers.Problem;

/**
 * @author Felix
 * @title: Shuhui Lin
 * @projectName MyLeetcode
 * @description: TODO
 * @date 2022/2/1819:21
 */
public class TwoSum_Medium_167 {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while(i<=j){
            int sum = numbers[i] + numbers[j];
            if (sum == target){
                return new int[]{i,j};
            }
            else if (sum < target){
                i++;
            }
            else{
                j--;
            }
        }

        return null;
    }


    public static void main(String[] args) {
        TwoSum_Medium_167 twoSum_medium_167 = new TwoSum_Medium_167();
        int[] numbers = new int[]{3,24,50,79,88,150,345};
        int target = 200;
        int[] ints = twoSum_medium_167.twoSum(numbers, target);
        System.out.println(ints.toString());

    }
}
