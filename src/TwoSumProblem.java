import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that
 * they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element
 * twice.
 * You can return the answer in any order.
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSumProblem {
    public static void main(String[] args) {
        Solution obj = new Solution();
        int[] result = new int[2];
        result = obj.twoSum(new int[]{2,7,11,15},9);
        for (int res:
             result) {
            System.out.print(res+ " ");
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement), i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}