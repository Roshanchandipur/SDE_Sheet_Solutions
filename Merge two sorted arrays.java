public class Solution {
    public static int[] ninjaAndSortedArrays(int arr1[], int arr2[], int m, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<m;++i)
            list.add(arr1[i]);
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(list.get(i)<arr2[j]){
                arr1[k++] = list.get(i);
                ++i;
            }
            else{
                arr1[k++] = arr2[j];
                ++j;
            }
        }
        while(i<m){
            arr1[k++] = list.get(i++);
        }
        while(j<n) 
            arr1[k++] = arr2[j++];
        return arr1;
    }
}
