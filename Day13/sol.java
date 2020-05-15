class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (char c : num.toCharArray()) {
            while (!stack.isEmpty() && stack.peek() > c && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }
       
        while (!stack.isEmpty() && k > 0) {
            stack.pop();
            k--;
        }
        
        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }
        return removeTrailingZeros(ans.reverse());
    }
    
    private String removeTrailingZeros(StringBuilder reverse) {
        int start = 0;
        while (start < reverse.length() && reverse.charAt(start) == '0') {
            start++;
        }
        return start >= reverse.length() ? "0" : reverse.substring(start); 
    }
}