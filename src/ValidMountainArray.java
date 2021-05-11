/*
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 * Recall that arr is a mountain array if and only if:
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 * Example:
 * Input: arr = [0,3,2,1]
 * Output: true
 */
public class ValidMountainArray {
    public static void main(String[] args) {
        Solution15 obj = new Solution15();
        boolean result = obj.validMountainArray(new int[]{0,3,2,1});
        System.out.println(result);
    }
}
class Solution15 {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        int length = 0;
        boolean flag1 = false;
        boolean flag2 = false;

        if(arr.length >= 3){
            while(i <= arr.length - 2 && arr[i] < arr[i+1]){
                length++;
                i++;
                flag1 = true;
            }
            while(i <= arr.length - 2 && arr[i] == arr[i+1]){
                i++;
                length++;
            }
            while(i <= arr.length - 2 && arr[i] > arr[i+1]){
                flag2 = true;
                length++;
                i++;
                if(i == arr.length - 1){
                    length++;
                }
            }
            if(length == arr.length && flag1 && flag2)
                return true;
        }
        return false;
    }
}