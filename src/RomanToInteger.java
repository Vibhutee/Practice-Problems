/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Symbol       Value
 *   I             1
 *   V             5
 *   X             10
 *   L             50
 *   C             100
 *   D             500
 *   M             1000
 *
 * For example, 2 is written as II in Roman numeral, just two one's added together.
 * 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 *
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * There are six instances where subtraction is used:
 *
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 *
 * Given a roman numeral, convert it to an integer.
 *
 * Input: s = "IV"
 * Output: 4
 */
public class RomanToInteger {
    public static void main(String[] args) {
        Solution3 obj = new Solution3();
        int result = obj.romanToInt("IV");
        System.out.print(result);
    }
}
class Solution3 {
    public int romanToInt(String data) {
        int I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000;
        int number = 0;
        char temp = '\0',temp1 ='\0';
        for(int i = 0; i < data.length(); i++){
            temp = data.charAt(i);
            if(i != data.length()-1){
                temp1 = data.charAt(i+1);
            }
            if((temp == 'I') && (temp1== 'V')){
                number = number + (V - I);
                i++;
                continue;
            }
            if((temp == 'I') && (temp1 == 'X')){
                number = number + (X - I);
                i++;
                continue;
            }

            if((temp == 'X') && (temp1 == 'L')){
                number = number + (L - X);
                i++;
                continue;
            }
            if((temp == 'X') && (temp1== 'C')){
                number = number + (C - X);
                i++;
                continue;
            }
            if((temp == 'C') && (temp1 == 'D')){
                number = number + (D - C);
                i++;
                continue;
            }
            if((temp == 'C') && (temp1 == 'M')){
                number = number + (M - C);
                i++;
                continue;
            }
            if(temp == 'V'){
                number = number +  V;
            }
            if(temp == 'X'){
                number = number +  X;
            }
            if(temp == 'I'){
                number = number +  I;
            }
            if(temp =='D'){
                number = number +  D;
            }
            if(temp == 'M'){
                number = number +  M;
            }
            if(temp == 'L'){
                number = number +  L;
            }
            if(temp == 'C'){
                number = number +  C;
            }
            System.out.println(number);
        }
        return number;
    }
}