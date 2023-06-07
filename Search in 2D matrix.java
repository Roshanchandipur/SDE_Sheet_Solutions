public class Solution {
    static boolean searchMatrix(ArrayList<ArrayList<Integer>> mat, int target) {
        int i = 0, j = mat.size()-1;
        while(i<=j){
            int mid = i+(j-i)/2;
            ArrayList<Integer> l = mat.get(mid);
            if(target>=mat.get(mid).get(0) && target<=mat.get(mid).get(mat.get(mid).size()-1)){
                return bSearch(mat.get(mid), target);
            }
            else if(target<l.get(0))
                j = mid-1;
            else i = mid+1;
        }
        return false;
    }
    private static boolean bSearch(ArrayList<Integer> arr, int target){
        int i = 0, j = arr.size();
        while(i<=j){
            int mid = i+(j-i)/2;
            if(target==arr.get(mid)) return true;
            if(target<arr.get(mid)) j = mid-1;
            else i = mid+1;
        }
        return false;
    }
}