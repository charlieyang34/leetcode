package leetcode.editor.en;

public class MaxSubArray {

    public int maxSubArray(int[] array){
        int cur = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++){
           cur = Math.max(array[i], cur + array[i]);
           max = Math.max(cur, max);
        }

        return max;
    }

}

