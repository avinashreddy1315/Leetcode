class Solution {
    public int splitArray(int[] nums, int k) {

        int s = 0;
        int e = 0;

        for(int i = 0; i < nums.length; i++){
            s = Math.max(s, nums[i]);
            e += nums[i];
        }


        //binary search
        while(s < e){
            int mid = s + (e-s)/2;

            //calculte how amny pieces u can divide  with max sum

            int sum = 0;
            int pieces = 1;

            for(int num : nums){
                if(sum + num > mid){
                    sum = num;
                    pieces++;
                }else{
                    sum +=num;
                }
            }


            if(pieces > k){
                s = mid + 1;
            }else{
                e = mid;
            }


        }


        return e;
        
    }
}