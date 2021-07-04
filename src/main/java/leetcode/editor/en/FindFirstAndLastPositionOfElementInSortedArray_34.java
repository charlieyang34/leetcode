package leetcode.editor.en;

public class FindFirstAndLastPositionOfElementInSortedArray_34 {
        public int[] searchRange(int[] nums, int target) {
            int[] res = new int[2];
            res[0] = -1;
            res[1] = -1;

            if(nums == null || nums.length == 0){
                return res;
            }

            int l = 0;
            int r = nums.length-1;

            while(l<r){
                int mid = l + (r-l) /2;

                if(nums[mid] >= target){
                    r = mid;
                }else{
                    l = mid+1;
                }
            }

            if(nums[l] != target){
                return res;
            }else{
                res[0] = l;
            }

            r = nums.length-1;

            while(l<r){
                int mid = 1+l+(r-l)/2;

                if(nums[mid] <= target){
                    l = mid;
                }else{
                    r = mid -1;
                }
            }

            res[1] = l;

            return res;
        }
}
