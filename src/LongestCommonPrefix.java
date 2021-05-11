/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 *
 * Example:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 */
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Solution4 obj = new Solution4();
        String result = obj.longestCommonPrefix(new String[]{"flower","flow","flight"});
        System.out.print(result);
    }
}
class Solution4 {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder longestCommonPrefix = new StringBuilder();
        if (strs == null || strs.length == 0) {
            return longestCommonPrefix.toString();
        }
        int minimumLength = strs[0].length();
        for (int i = 1; i < strs.length; i++) {
            minimumLength = Math.min(minimumLength, strs[i].length());
        }
        for (int i = 0; i < minimumLength; i++) {
            char current = strs[0].charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != current) {
                    return longestCommonPrefix.toString();
                }
            }
            longestCommonPrefix.append(current);
        }
        return longestCommonPrefix.toString();
    }
}