package leetcode.editor.en;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] array){
        int max = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                 min = array[i];
            }
            max = Math.max(max, array[i] - min);
        }

        return max;
    }
}
