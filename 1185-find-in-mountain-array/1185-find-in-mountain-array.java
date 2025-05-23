/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {


        int s = 0;
        int e = mountainArr.length() -1;

        int peak = findPeak(mountainArr, s, e);

        int left =  findleft(mountainArr, s, peak, target);
        int right = findright(mountainArr, peak, e, target);


        if(left == -1 && right == -1){
            return -1;
        }else if(left == -1){
            return right;
        }else if(right == -1){
            return left;
        }else{
            return Math.min(left, right);
        }
        
    }



    public int findPeak(MountainArray arr, int s, int e){
        while(s < e){
            int mid = s + (e-s)/2;
            if(arr.get(mid) > arr.get(mid+ 1)){
                e = mid;
            }else{
                s = mid + 1;
            }
        }


        return s;
    }


    public int findleft(MountainArray arr, int s, int e, int target){
        while(s<=e){
            int mid = s + (e-s)/2;
                if(arr.get(mid) == target){
                    return mid;
                }else if(arr.get(mid) < target){
                    s = mid + 1;
                }else{
                    e = mid - 1;
                }
            
        }
        return -1;
    }
    
    public int findright(MountainArray arr, int s, int e, int target){
        while(s<=e){
            int mid = s + (e-s)/2;
                if(arr.get(mid) == target){
                    return mid;
                }else if(target > arr.get(mid)){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
        }
        return -1;
    }
}