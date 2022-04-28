public class L189 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 1 || k == 0) {
            return;
        }
        int length = nums.length;
        int[] newArr = new int[nums.length];
        for (int i = 0; i < length; i++) {
            newArr[(i + k) % length] = nums[i];
        }
        System.arraycopy(newArr, 0, nums, 0, length);
    }
}
