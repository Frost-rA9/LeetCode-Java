public class L2024 {
    String s;
    int n, _k;

    public int maxConsecutiveAnswers(String answerKey, int k) {
        s = answerKey;
        n = answerKey.length();
        _k = k;
        return Math.max(getCount('T'), getCount('F'));
    }

    public int getCount(char c) {
        int ans = 0;
        for (int left = 0, right = 0, count = 0; left < n; left++) {
            if (s.charAt(left) == c) {
                count++;
            }
            while (count > _k) {
                if (s.charAt(right) == c) {
                    count--;
                }
                right++;
            }
            ans = Math.max(ans, left - right + 1);
        }
        return ans;
    }
}
