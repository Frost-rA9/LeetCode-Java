import java.util.HashSet;
import java.util.Set;

public class L36 {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            Set<Character> lineSet = new HashSet<>();
            Set<Character> columSet = new HashSet<>();
            Set<Character> cellSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.' && !lineSet.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !columSet.add(board[j][i])) {
                    return false;
                }
                int m = (i / 3) * 3 + j / 3;
                int n = (i % 3) * 3 + j % 3;
                if (board[m][n] != '.' && !cellSet.add(board[m][n])) {
                    return false;
                }
            }
        }
        return true;
    }
}
