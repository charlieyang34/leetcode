package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    private final BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();

    @Test
    void maxProfit() {
        int expected = 5;
        int[] input = new int[] {7,1,5,3,6,4};

        assertEquals(expected, bestTimeToBuyAndSellStock.maxProfit(input));
    }
}