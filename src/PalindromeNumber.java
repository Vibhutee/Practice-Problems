/*
 * Given an integer x, return true if x is palindrome integer.
 * An integer is a palindrome when it reads the same backward as forward.
 * For example, 121 is palindrome while 123 is not.
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        Solution2 obj = new Solution2();
        boolean result;
        result = obj.isPalindrome(121);
        System.out.print(result);
    }
}
class Solution2 {
    public boolean isPalindrome(int x) {

        int temp = x;           // Store x in a temp variable before we start processing it
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
            return false;
        }
        if(reverse == temp)     // Compare if both the variables are equal
            return true;
        return false;

    }
}