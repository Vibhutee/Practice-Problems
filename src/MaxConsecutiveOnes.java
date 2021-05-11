/*
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * Input: nums = [1,1,0,1,1,1]
 * Output: 3
 * Explanation: The first two digits or the last three digits are consecutive 1s.
 * The maximum number of consecutive 1s is 3.
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        Solution14 obj = new Solution14();
        int result = obj.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1});
        System.out.println(result);
    }
}
class Solution14 {
    public int findMaxConsecutiveOnes(int[] nums) {

        int result = 0;
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 1){
                ++count;
            }
            if(nums[i] == 0){
                count = 0;
            }
            if(count > result){
                result = count;
            }

        }
        return result;
    }
}