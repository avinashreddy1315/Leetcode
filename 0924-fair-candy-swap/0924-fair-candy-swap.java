class Solution {
    public int[] fairCandySwap(int[] a, int[] b) {

        int[] answer = new int[2];

        int sumA = 0, sumB = 0;


        for(int i : a){
            sumA += i;
        }

        for(int i : b){
            sumB += i;
        }


        for(int i = 0; i< a.length; i++){
            for(int j = 0; j< b.length; j++){
                if(sumA - a[i] + b[j] == sumB + a[i] -b[j]){
                    answer[0] = a[i];
                    answer[1] = b[j];
                    return answer;
                }
            }
        }

        return answer;
        
    }
}