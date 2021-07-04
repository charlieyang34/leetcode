package leetcode.editor.en;

public class SortAnArray_912_QuickSort {
    public int[] sortArray(int[] nums) {
        sortArray(nums, 0, nums.length);
        return nums;
    }


    public void sortArray(int[] nums, int start, int end) {
        int pivot = nums[start + (end - start)/2];
        int i = start;
        int j = end - 1;

        while (i <= j) {
            while (nums[i] < pivot) {
                i++;
            }

            while (nums[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            }
        }

        if (start < j)
            sortArray(nums, start, j + 1);
        if (i < end)
            sortArray(nums, i, end);
    }
}
