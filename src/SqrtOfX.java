/*
 * Given a non-negative integer x, compute and return the square root of x.
 * Since the return type is an integer, the decimal digits are truncated, and only
 * the integer part of the result is returned.
 *
 * Example:
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 */
public class SqrtOfX {
    public static void main(String[] args) {
        Solution7 obj = new Solution7();
        int result = obj.mySqrt(8);
        System.out.print(result);
    }
}
class Solution7 {
    public int mySqrt(int x) {
        return (int)(Math.sqrt(x));
    }
}
