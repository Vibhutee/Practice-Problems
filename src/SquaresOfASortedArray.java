/*
 * Given an integer array nums sorted in non-decreasing order, return an array of the
 * squares of each number sorted in non-decreasing order.
 *
 * Example:
 * Input: nums = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 */
import java.util.Arrays;

public class SquaresOfASortedArray {
    public static void main(String[] args) {
        Solution16 obj = new Solution16();
        int[] result = obj.sortedSquares(new int[]{-4,-1,0,3,10});
        for(int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}
class Solution16 {
    public int[] sortedSquares(int[] nums) {
        if(nums[0] > 0){
            for(int i = 0; i < nums.length; i++){
                nums[i] = nums[i]*nums[i];
            }
            return nums;
        }
        for(int i = 0; i < nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}