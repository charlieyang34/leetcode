package leetcode.editor.en;

public class ShortestWordDistance {

    public int shortestDistance(String[] array, String word1, String word2){
        int pos1 = -1;
        int pos2 = -1;
        int distance = array.length;

        for (int i = 0; i < array.length; i++){
            if (array[i] == word1){
                pos1 = i;
            }

            if (array[i] == word2){
                pos2 = i;
            }

            if (pos1 != -1 && pos2 != -1){
                distance = Math.abs(pos1-pos2);
            }
        }
        return distance;
    }
}
