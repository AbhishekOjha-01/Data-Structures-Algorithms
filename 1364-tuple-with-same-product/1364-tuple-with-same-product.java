class Solution {
    private int tupleNum(int n) {
        return (n * (n - 1)) / 2;
    }
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++) {
                int prod = nums[i] * nums[j];
                freq.put(prod, freq.getOrDefault(prod, 0) + 1);
            }
        }
        int count = 0;
        for(int frequency : freq.values()) {
            count = count + 8 * tupleNum(frequency);
        }
        return count;
    }
}