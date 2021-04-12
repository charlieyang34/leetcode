package leetcode.editor.en;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShortestWordDistanceTest {

    private final ShortestWordDistance shortestWordDistance = new ShortestWordDistance();

    @Test
    void shortestDistance() {
        int expected = 3;
        String[] wordsDict = new String[] {"practice", "makes", "perfect", "coding", "makes"};
        String word1 = "coding", word2 = "practice";
        assertEquals(expected, shortestWordDistance.shortestDistance(wordsDict, word1, word2));
    }
}