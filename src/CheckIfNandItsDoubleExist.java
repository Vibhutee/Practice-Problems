/*
 * Given an array arr of integers, check if there exists two integers N and M such that N
 * is the double of M ( i.e. N = 2 * M).
 * More formally check if there exists two indices i and j such that :
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 *
 * Example:
 * Input: arr = [10,2,5,3]
 * Output: true
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 */
public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        Solution21 obj = new Solution21();
        boolean result = obj.checkIfExist(new int[]{10,2,5,3});
        System.out.println(result);
    }
}
class Solution21 {
    public boolean checkIfExist(int[] arr) {
        if(arr == null || arr.length == 0)
            return false;
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == 2*arr[j] || arr[j] == 2*arr[i])
                    return true;
            }
        }
        return false;
    }
}
