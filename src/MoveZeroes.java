/*
 * Given an integer array nums, move all 0's to the end of it while maintaining the
 * relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class MoveZeroes {
    public static void main(String[] args) {
        Solution11 obj = new Solution11();
        obj.moveZeroes(new int[]{0,1,0,3,12});
    }
}
class Solution11 {
    public void moveZeroes(int[] nums) {
        // writePointer
        int i = 0;
        // readPointer
        int j;

        for(j = 0; j < nums.length; j++){
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        while(i < nums.length){
            nums[i] = 0;
            i++;
        }
        for (int num:
             nums) {
            System.out.println(num);
        }
    }
}
