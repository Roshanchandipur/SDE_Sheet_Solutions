import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long sum = Integer.MIN_VALUE;
		long curr = 0;
		for(int i: arr){
			curr+=i;
			sum = Math.max(sum, curr);
			if(curr<0) curr = 0;
		}
		if(sum<0) sum = 0;
		return sum;
	}

}
