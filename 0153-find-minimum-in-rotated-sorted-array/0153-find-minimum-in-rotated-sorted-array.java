class Solution {
    public int findMin(int[] nums) {


        if(nums.length == 1){
            return nums[0];
        }


        int a = findPiviot(nums);


        if(a == nums.length - 1){
            return nums[0];
        }
        else{
            return nums[a + 1];
        }
        
        
        
    }


    public int findPiviot(int[] nums){
        int s = 0;
        int e = nums.length - 1;

        while(s <= e){
            int mid = s + (e-s)/2;
            if(mid < e && nums[mid] > nums[mid + 1]) return mid;
            if(nums[s]> nums[mid] && nums[mid] < nums[mid -1]) return mid - 1;
            if(nums[mid] < nums[s]){
                e = mid + 1;
            }else{
                s = mid + 1;
            }
        }


        return nums.length - 1;
    }
}