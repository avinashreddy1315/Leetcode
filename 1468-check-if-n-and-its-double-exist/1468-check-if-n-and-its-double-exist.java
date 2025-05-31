class Solution {
    public boolean checkIfExist(int[] arr) {
        
        /*for(int i = 0; i < arr.length; i++){
            for(int j = 0; j <arr.length; j++){
                if(i != j && arr[j] * 2 == arr[i]){
                    return true;
                }
            }
        } */

        Set<Integer> set = new HashSet<>();


        for(int num : arr){
            if(set.contains(2*num) || (num % 2 == 0 && set.contains(num/2))){
                return true;
            }

            set.add(num);
        }


        return false;
    }
}