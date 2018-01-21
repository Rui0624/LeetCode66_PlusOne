
public class Solution {
	
	
	public  int[] plusOne(int[] digits) {
        int carry = 0;
        int m = digits.length;
        digits[m - 1]++;
        for(int i = m - 1; i >= 0; i--){
        	digits[i] += carry;
        	carry = 0;
        	if(digits[i] > 9){
        		carry = 1;
        		digits[i] %= 10;
        	}
        }
        
        if(carry == 1){
        	int[] res = new int[m + 1];
        	for(int i = m - 1; i >= 0; i--){
        		res[i + 1] = digits[i];
        	}
        	res[1] = digits[0] % 10;
        	res[0] = 1;
        	
        	return res;
        }else
        	return digits;
    }
}
