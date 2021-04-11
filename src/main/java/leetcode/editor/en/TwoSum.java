package leetcode.editor.en;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] array, int target){

        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++){
            int remain = target - array[i];
            if (map.containsKey(remain)){
                res[0] = map.get(remain);
                res[1] = i;
            }else{
                map.put(array[i], i);
            }
        }
        return res;
    }
}
