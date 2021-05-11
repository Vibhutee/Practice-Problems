/*
 * Given integer array nums, return the third maximum number in this array.
 * If the third maximum does not exist, return the maximum number.
 *
 * Example:
 * Input: nums = [2,2,3,1]
 * Output: 1
 * Explanation: Note that the third maximum here means the third maximum distinct number.
 * Both numbers with value 2 are both considered as second maximum.
 */
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        Solution12 obj = new Solution12();
        int result = obj.thirdMax(new int[]{3,2,1});
        System.out.println(result);
    }
}
class Solution12 {
    public int thirdMax(int[] nums) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<Integer>();
        for(int i = 0; i < nums.length; i++)
            numbers.add(nums[i]);

        Integer[] intArray = new Integer[ numbers.size() ];
        intArray = numbers.toArray(intArray);
        Arrays.sort(intArray, Collections.reverseOrder());

        if(intArray.length >= 3)
            return (intArray[2]);

        return intArray[0];

    }
}