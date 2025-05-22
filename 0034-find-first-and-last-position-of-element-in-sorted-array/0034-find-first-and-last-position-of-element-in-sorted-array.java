class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int first = findfirst(nums, target);
        int last = findlast(nums, target);
        
        return new int[]{first, last};
    }


    public static int findfirst(int[] arr, int target){
        int start = 0, end = arr.length -1, result = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                result = mid;
                end = mid -1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return result;
    }


    public static int findlast(int[] arr, int target){
        int start = 0, end = arr.length -1, result = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] == target){
                result = mid;
                start = mid + 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }

        return result;
    }
}