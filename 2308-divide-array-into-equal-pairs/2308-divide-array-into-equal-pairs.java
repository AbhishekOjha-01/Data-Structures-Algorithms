class Solution {
    public boolean divideArray(int[] nums) {
        Map<Integer, Integer> table = new HashMap<>();
        for(int num : nums) {
            table.put(num, table.getOrDefault(num, 0) + 1);
        }
        for(int count : table.values()) {
            if(count % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}