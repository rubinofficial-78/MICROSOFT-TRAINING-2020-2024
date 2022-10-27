class Solution {
    public int mySqrt(int x) {
        if(x == 0){
            return 0;
        }
        int L, R;
        L = 1;
        R = x;
        while(L <= R){
            int mid = L +(R-L)/2;
            if(mid == x/mid){
                return mid;
            }else if(mid < x/mid){
                L = mid+1;
            }
            else{
                R = mid-1;
            }
        }
        return R;
    }
}
