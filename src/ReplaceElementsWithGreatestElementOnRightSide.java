/*
 * Given an array arr, replace every element in that array with the greatest element among
 * the elements to its right, and replace the last element with -1.
 *
 * After doing so, return the array.
 *
 * Example:
 * Input: arr = [17,18,5,4,6,1]
 * Output: [18,6,6,6,1,-1]
 * Explanation:
 * - index 0 --> the greatest element to the right of index 0 is index 1 (18).
 * - index 1 --> the greatest element to the right of index 1 is index 4 (6).
 * - index 2 --> the greatest element to the right of index 2 is index 4 (6).
 * - index 3 --> the greatest element to the right of index 3 is index 4 (6).
 * - index 4 --> the greatest element to the right of index 4 is index 5 (1).
 * - index 5 --> there are no elements to the right of index 5, so we put -1.
 */
public class ReplaceElementsWithGreatestElementOnRightSide {
    public static void main(String[] args) {
        Solution20 obj = new Solution20();
        int[] result = obj.replaceElements(new int[]{17,18,5,4,6,1});
        for(int i = 0; i < result.length; i++)
            System.out.println(result[i]);
    }
}
class Solution20 {
    public int[] replaceElements(int[] arr) {
        int max = 0;

        if(arr == null)
            return arr;

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            arr[i] = max;
            max = 0;
        }
        arr[arr.length - 1] = -1;
        return arr;
    }
}
