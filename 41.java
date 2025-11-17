class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;
        boolean present[] = new boolean[n + 1];
        for (int i = 0; i < n; i++) {

            int num = nums[i];

            if (num > 0 && num <= n) {
                present[ num ] = true;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (present[i] == false) {
                return i;
            }
        }
        return n + 1;
    }
}
