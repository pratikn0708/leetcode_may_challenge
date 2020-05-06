class Solution {
    public int findComplement(int num) {
        int sum = 1;
        while (sum < num){
            sum = (sum << 1) + 1;
        }
        return sum - num;
    }
}