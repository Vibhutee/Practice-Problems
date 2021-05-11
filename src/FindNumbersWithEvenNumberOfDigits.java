/*
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * Example:
 * Input: nums = [12,345,2,6,7896]
 * Output: 2
 * Explanation:
 * 12 contains 2 digits (even number of digits).
 * 345 contains 3 digits (odd number of digits).
 * 2 contains 1 digit (odd number of digits).
 * 6 contains 1 digit (odd number of digits).
 * 7896 contains 4 digits (even number of digits).
 * Therefore only 12 and 7896 contain an even number of digits.
 */
public class FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        Solution19 obj = new Solution19();
        int result = obj.findNumbers(new int[]{12,345,2,6,7896});
        System.out.println(result);
    }
}
class Solution19 {
    public int findNumbers(int[] nums) {
        int count = 0;
        int digit = 0;
        for(int num : nums){
            while(num>0){
                digit++;
                num = num/10;
            }
            if(digit%2 == 0){
                count++;
            }
            digit = 0;
        }
        return count;
    }
}