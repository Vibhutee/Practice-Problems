/*
 * Given a fixed length array arr of integers, duplicate each occurrence of zero,
 * shifting the remaining elements to the right.
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place, do not return anything from your function.
 *
 * Example:
 * Input: [1,0,2,3,0,4,5,0]
 * Output: [1,0,0,2,3,0,0,4]
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
 */
public class DuplicateZeros {
    public static void main(String[] args) {
        Solution18 obj = new Solution18();
        obj.duplicateZeros(new int[]{1,0,2,3,0,4,5,0});
    }
}
class Solution18 {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        for(int i = 0; i <= length - 1; i++){
            if(arr[i] == 0){
                int j;
                for(j = length - 1; j > i; j--){
                    arr[j] = arr[j-1];
                }
                if(i != (length - 1))
                    arr[j] = 0;
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++){
            System.out.print(arr[j]+ "  ");
        }
    }
}
