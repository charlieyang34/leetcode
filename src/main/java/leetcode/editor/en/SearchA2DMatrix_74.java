package leetcode.editor.en;

public class SearchA2DMatrix_74 {
        public boolean searchMatrix(int[][] mat, int t) {
            int m = mat.length, n = mat[0].length;
            int left = 0, right = m * n - 1;
            while (left < right) {
                int mid = left + (right -left)/2;
                if (mat[mid / n][mid % n] >= t) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return mat[left / n][left % n] == t;
        }
}
