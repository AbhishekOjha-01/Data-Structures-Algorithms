class Solution {
    public int[] buildArray(int[] nums) {
        int[] tempArr = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            tempArr[i] = nums[nums[i]];
        }
        return tempArr;
    }
}