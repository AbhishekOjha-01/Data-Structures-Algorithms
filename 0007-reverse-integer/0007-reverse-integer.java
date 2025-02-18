class Solution {
    public int reverse(int x) {
        int temp = Math.abs(x);
        int rev = 0;
        while(temp != 0) {
            int rem = temp % 10;
            if(rev > (Integer.MAX_VALUE - rem) / 10) {
                return 0;
            }
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(x < 0) {
            return (-rev);
        }
        return rev;
    }
}