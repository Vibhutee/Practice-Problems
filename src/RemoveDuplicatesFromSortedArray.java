/*
 * Given a sorted array nums, remove the duplicates in-place such that each element appears only once
 * and returns the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array
 * in-place with O(1) extra memory.
 *
 * Input: nums = [1,1,2]
 * Output: 2, nums = [1,2]
 * Explanation: Your function should return length = 2, with the first two elements of nums
 * being 1 and 2 respectively. It doesn't matter what you leave beyond the returned length.
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        Solution5 obj = new Solution5();
        int result = obj.removeDuplicates(new int[]{1,1,2});
        System.out.print(result);
    }
}
class Solution5 {
    // An function to remove duplicates without using another array
    public int removeDuplicates(int[] nums) {
        // Taking a slow pointer
        int i = 0;
        //Here, j will be our fast pointer
        for (int j = 1; j < nums.length; j++) {
            // If two elements are not same then increment the value of i and store it in nums
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        // return length of an array
        return i + 1;
    }
}
