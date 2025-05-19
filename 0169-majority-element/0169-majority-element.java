class Solution {
    public int majorityElement(int[] nums) {

        int ele = nums[0];
        int count = 0;
        for(int i = 0; i < nums.length; i++){

            if(nums[i] == ele){
                count++;
            }else{
                count--;
            }

            if(count == 0){
                ele= nums[i + 1];
            }

        }

        int c = 0;
        for(int i = 0; i <nums.length; i++){
            if(nums[i] == ele){
                c++;
            }
        }

        if(c > nums.length/2){
            return ele;
        }else{
            return -1;
        }
        
    }
}