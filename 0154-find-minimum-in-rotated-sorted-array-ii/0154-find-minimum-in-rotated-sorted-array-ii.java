class Solution {
    public int findMin(int[] nums) {
        int start = 0, end = nums.length - 1;

    while (start < end) {
        int mid = start + (end - start) / 2;

        if (nums[mid] > nums[end]) {
            start = mid + 1;  // Minimum is in the right half
        } else if (nums[mid] < nums[end]) {
            end = mid;  // Minimum is in the left half including mid
        } else {
            end--;  // nums[mid] == nums[end], cannot decide, shrink right
        }
    }

    return nums[start];
    }


    
}