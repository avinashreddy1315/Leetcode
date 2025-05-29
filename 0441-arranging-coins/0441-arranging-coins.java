class Solution {
    public int arrangeCoins(int n) {


        int s = 0;
        int e = n;
        int a = 0;

        while(s <= e){
            int mid = s + (e-s)/2;

            long k = ((long) mid * (mid + 1)) / 2;

            if(k <= n){
                a = mid;
                s = mid + 1;
            }else{
                e = mid - 1;
            }


        }
        

        return a;
    }
}