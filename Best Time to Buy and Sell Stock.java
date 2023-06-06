import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution{
    public static int maximumProfit(ArrayList<Integer> prices){
        int min = prices.get(0);
        int max = 0;
        for(int i=1;i<prices.size();++i){
            if(prices.get(i)>min){
                max = Math.max(max, prices.get(i)-min);
            }
            else{
                min = Math.min(min, prices.get(i));
            }
        }
        return max;
    }
}