public class Solution {
    public static int modularExponentiation(int x, int n, int m) {
        if(n==0) return 1;
        if(n==1) return x%m;

        if(n%2==0){
            long e = modularExponentiation(x, n/2, m);
            return (int)(((e%m)*(e%m))%m);
        }
        else{
            long e = modularExponentiation(x, n/2,m);
            return (int)(((x%m * (e%m))%m * (e%m))%m);
        }

    }
}