class Solution {
    public int findNumbers(int[] nums) {

        int count = 0;


        for(int num : nums){
            if(containDigit2(num)){
                count++;
            }
        }

        return count;
        
    }

    static boolean containDigit2(int num){
        int c = (int)(Math.log10(num)) + 1;
        return c%2 == 0;
    }


    public static boolean containDigit(int num){
        int c = 0;
        if(num == 0){
            return false;
        }
        while(num > 0){
            c++;
            num = num/10;
        }
        /*if(c%2 == 0){
            return true;
        }else{
            return false;
        } */

        return c%2 == 0;
    }
}