import java.util.ArrayList;
import java.util.List;

public class L54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int count = (Math.min(m, n) + 1) / 2;
        int i = 0;
        while (i < count) {
            for (int j = i; j < n - i; j++) {
                result.add(matrix[i][j]);
            }
            for (int j = i + 1; j < m - i; j++) {
                result.add(matrix[j][(n - 1) - i]);
            }
            for (int j = (n - 1) - (i + 1); j >= i && (m - 1 - i) != i; j--) {
                result.add(matrix[(m - 1) - i][j]);
            }
            for (int j = (m - 1) - (i + 1); j >= i + 1 && (n - 1 - i) != i; j--) {
                result.add(matrix[j][i]);
            }
            i++;
        }
        return result;
    }
}
