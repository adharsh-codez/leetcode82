class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0, diff; for (int n : nums) xor ^= n;
        diff = xor & -xor; int[] res = new int[2];
        for (int n : nums) if ((n & diff) == 0) res[0] ^= n; else res[1] ^= n;
        return res;
    }
}