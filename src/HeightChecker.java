/*
 * A school is trying to take an annual photo of all the students.
 * The students are asked to stand in a single file line in non-decreasing order by height.
 * Let this ordering be represented by the integer array expected where expected[i] is the expected
 * height of the ith student in line. You are given an integer array heights representing the current
 * order that the students are standing in. Each heights[i] is the height of the ith student in line
 * (0-indexed).
 *
 * Return the number of indices where heights[i] != expected[i].
 *
 * Example:
 * Input: heights = [1,1,4,2,1,3]
 * Output: 3
 * Explanation:
 * heights:  [1,1,4,2,1,3]
 * expected: [1,1,1,2,3,4]
 * Indices 2, 4, and 5 do not match.
 */

public class HeightChecker {
    public static void main(String[] args) {
        Solution17 obj = new Solution17();
        int result = obj.heightChecker(new int[]{1,1,4,2,1,3});
        System.out.println(result);
    }
}
class Solution17 {
    public int heightChecker(int[] heights) {
        int count = 0;
        int temp = 0;
        int[] orignalArray = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            orignalArray[i] = heights[i];
        }
        for(int i = 0; i < heights.length - 1; i++){
            for(int j = i + 1; j < heights.length ; j++){
                if(heights[i] > heights[j]){
                    temp = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp;
                }
            }
        }
        for(int i = 0; i < heights.length; i++){
            if(orignalArray[i] != heights[i]){
                count++;
            }
        }
        if(count == 0)
            return count;
        return count;
    }
}
