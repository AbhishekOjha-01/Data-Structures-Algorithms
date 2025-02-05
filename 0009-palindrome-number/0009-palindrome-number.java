class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        int temp = x;
        int num = 0;
        while(x != 0) {
            int rem = x % 10;
            num = num * 10 + rem;
            x = x / 10;
        }
        if(num != temp) {
            return false;
        }
        return true;
    }
}