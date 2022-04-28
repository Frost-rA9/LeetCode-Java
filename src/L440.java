public class L440 {
    public int findKthNumber(int n, int k) {
        long cur = 1;
        k--;
        while (k > 0) {
            int nodes = findNodes(n, cur);
            if (nodes <= k) {
                cur++;
                k -= nodes;
            } else {
                cur *= 10;
                k--;
            }
        }
        return (int) cur;
    }

    private int findNodes(int n, long cur) {
        long next = cur + 1;
        long totalNodes = 0;
        while (cur <= n) {
            totalNodes += Math.min(n - cur + 1, next - cur);
            cur *= 10;
            next *= 10;
        }
        return (int) totalNodes;
    }
}
