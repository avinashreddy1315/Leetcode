class Solution {
    public int maximumWealth(int[][] accounts) {

        int max = 0;
        for(int[] acc1 : accounts){
            int money = 0;
            for(int acc2 : acc1){
                money += acc2;
            }
            
            if(money > max){
                max = money;
            }
        }

        return max;
        
    }
}