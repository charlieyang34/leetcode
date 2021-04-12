package leetcode.editor.en;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] array, int target){

        HashMap<Integer, Integer> map =  new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < array.length; i++){
            int remain = target - array[i];
            if (map.containsKey(remain)){
                result[0] = map.get(remain);
                result[1] = i;
            }else{
                map.put(array[i], i);
            }
        }
        return result;
    }
}
