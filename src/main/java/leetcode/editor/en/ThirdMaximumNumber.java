package leetcode.editor.en;

import java.util.Arrays;
import java.util.Comparator;

public class ThirdMaximumNumber {

    public int thirdMaximumNumber(int[] array){

        Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;

        for (Integer element: array){
            if (element.equals(max1) || element.equals(max2) || element.equals(max3)){
                continue;
            }
            if (max1 == null || element > max1 ){
                max3 = max2;
                max2 = max1;
                max1 = element;
            }else if (max2 == null || element > max2) {
                max3 = max2;
                max2 = element;
            }else if (max3 == null || element > max3){
                max3 = element;
            }
        }

        return max3 == null ? max1 : max3;

    }
}
