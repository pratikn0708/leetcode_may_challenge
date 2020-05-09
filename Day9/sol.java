class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==1)
            return true;

 	// FIRST APPROACH       
        // for(int i=2;i<=num/2;i++){
        //     if(i*i==num){
        //         return true;
        //     }
        // }
        // return false;
        

	// SECOND APPROACH
        long left = 1, right = num;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (mid * mid == num) return true; // check if mid is perfect square
            if (mid * mid < num) { // mid is small -> go right to increase mid
                left = mid + 1;
            } else {
                right = mid - 1; // mid is large -> to left to decrease mid
            }
        }
        return false; 
        
    }
}