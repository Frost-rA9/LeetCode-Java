public class L209 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        int i = 0;
        int subLength = 0;
        for (int j = 0; j < nums.length; j++) {
            sum += nums[j];
            while (sum >= target) {
                subLength = j - i + 1;
                result = Math.min(result, subLength);
                sum -= nums[i];
                i++;
            }
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
