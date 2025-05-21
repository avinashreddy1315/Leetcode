class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;


        for(int num : nums){
            if(containDigit(num)){
                count++;
            }
        }

        return count;
        
    }


    public static boolean containDigit(int num){
        int c = 0;
        while(num > 0){
            if(num % 10 >=0){
                c++;
            }

            num = num/10;
        }
        if(c%2 == 0){
            return true;
        }else{
            return false;
        }
    }
}