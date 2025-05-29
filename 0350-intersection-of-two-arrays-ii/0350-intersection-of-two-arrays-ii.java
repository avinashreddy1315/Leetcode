class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> set1 = new HashMap<>();


        //converting the nums1 to set
        for(int num : nums1){
            set1.put(num, set1.getOrDefault(num, 0) + 1);
        }


        //check the cammon elements in set1 and nums if found remove that elemnt set1
        List<Integer> ResultArrayList = new ArrayList<>();

        for(int num : nums2){
            if(set1.containsKey(num) && set1.get(num) > 0){
                ResultArrayList.add(num);
                 set1.put(num, set1.get(num) - 1);
            }
        }


        //converting result set to array

        int[] resarr = new int[ResultArrayList.size()];

       
        for (int i = 0; i < resarr.length; i++) {
            resarr[i] = ResultArrayList.get(i);
        }


        return resarr;
    }
}