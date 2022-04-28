import java.util.ArrayList;
import java.util.List;

public class L386 {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>();
        int nunber = 1;
        for (int i = 0; i <= n; i++) {
            result.add(nunber);
            if (nunber * 10 <= n) {
                nunber *= 10;
            } else {
                while (nunber % 10 == 9 || nunber + 1 > n) {
                    nunber /= 10;
                }
                nunber++;
            }
        }
        return result;
    }
}
