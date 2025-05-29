class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();


        //converting the nums1 to set
        for(int num : nums1){
            set1.add(num);
        }


        //check the cammon elements in set1 and nums if found remove that elemnt set1
        Set<Integer> ResultSet = new HashSet<>();

        for(int num : nums2){
            if(set1.contains(num)){
                ResultSet.add(num);
                set1.remove(num);
            }
        }


        //converting result set to array

        int[] resarr = new int[ResultSet.size()];

        int i = 0;
        for(int num : ResultSet){
            resarr[i++] = num;
        }


        return resarr;
        
    }
}