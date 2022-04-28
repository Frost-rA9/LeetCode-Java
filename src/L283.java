public class L283 {
    public void moveZeroes(int[] nums) {
        int slowIndex = 0;
        for (int fastIndex = 0; fastIndex < nums.length; fastIndex++) {
            if (0 != nums[fastIndex]) {
                int temp = nums[slowIndex];
                nums[slowIndex] = nums[fastIndex];
                nums[fastIndex] = temp;
                slowIndex++;
            }
        }
    }
}
