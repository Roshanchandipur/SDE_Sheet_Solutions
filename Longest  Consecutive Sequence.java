public class Solution {
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        Set<Integer> set = new HashSet<>();
        int len = 0;
        for(int i: arr)
            set.add(i);
        for(int i: set){
            if(set.contains(i-1));
            else{
                int currLen = 0;
                while(set.contains(i)){
                    ++currLen;
                    ++i;
                }
                len = Math.max(len, currLen);
            }
        }
        return len;
    }
}