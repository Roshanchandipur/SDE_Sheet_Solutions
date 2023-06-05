import java.util.* ;
import java.io.*; 

public class Solution {
	
	public static long maxSubarraySum(int[] arr, int n) {
		long sum = Integer.MIN_VALUE;
		long curr = 0;
		for(int i: arr){
			cupublic class Solution 
{
    public static void sort012(int[] arr)
    {
        int i=-1,j=arr.length;
        for(int m=0;m<j;){
            if(arr[m]==0){
                swap(arr,++i,m++);
            }
            else if(arr[m]==2){
                swap(arr,m,--j);
            }
            else ++m;
        }
    }
    private static void swap(int arr[], int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}rr+=i;
			sum = Math.max(sum, curr);
			if(curr<0) curr = 0;
		}
		if(sum<0) sum = 0;
		return sum;
	}

}
