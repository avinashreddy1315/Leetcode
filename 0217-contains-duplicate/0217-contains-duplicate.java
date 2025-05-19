class Solution {
    public boolean containsDuplicate(int[] nums) {


        // this is bruite force approche time complixity is O(n)

       /* boolean hasduplicate = false;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    hasduplicate = true;
                    break;
                }
            }

            if(hasduplicate) break;
        }

        return hasduplicate; */

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }

        return false;
        
    }
}