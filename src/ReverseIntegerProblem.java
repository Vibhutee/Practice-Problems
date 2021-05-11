/*
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x
 * causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * Example:
 * Input: x = 123
 * Output: 321
 */
public class ReverseIntegerProblem {
    public static void main(String[] args) {
        Solution1 obj = new Solution1();
        int result = obj.reverse(123);
        System.out.println(result);
    }
}
class Solution1 {
    public int reverse(int x) {

        long reverse=0;         // To store reversed integer
        boolean flag = false;   //To check if number is positive or negative

        //If the number is negative change it to positive and then perform the operation
        if(x<0){
            flag = true;
            x = x*(-1);
        }
        // Logic to reverse the digits
        while(x > 0){
            reverse = (x%10) + reverse*10;
            x = x/10;
        }
        // Change the number again to negative if it was negative
        if(flag){
            reverse = -reverse;
        }

        /** Integer.MIN_VALUE specifies minimum possible value for any integer variable
         *   Integer.MAX_VALUE specifies maximum possible value for any integer variable
         *   We will return zero as the value goes outside 32 bit integer range
         */
        if(reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE){
            return 0;
        }
        return (int)reverse;
    }
}