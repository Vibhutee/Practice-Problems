/*
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the
 * integers in the range [1, n] that do not appear in nums.
 *
 * Example:
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 */
import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public static void main(String[] args) {
        Solution13 obj = new Solution13();
        List<Integer> result = obj.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1});
        System.out.println(result);
    }
}
class Solution13 {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<Integer>(nums.length);
        boolean array[] = new boolean[nums.length + 1];

        for(int i = 0; i < nums.length; i++){
            array[nums[i]] = true;
        }
        for(int j = 1; j <= nums.length; j++){
            if(array[j] == false){
                result.add(j);
            }
        }
        return result;
    }
}