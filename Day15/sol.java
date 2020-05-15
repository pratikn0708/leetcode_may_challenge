class Solution {
    
        // APPROACH 1
//     public int maxSubarraySumCircular(int[] A) {
//         if(A.length == 0) return 0;
//         int sum = A[0];
//         int maxSoFar = A[0];
//         int maxTotal = A[0];
//         int minTotal = A[0];
//         int minSoFar = A[0];
//         for(int i = 1; i < A.length; i++){
//             int num = A[i];
//             maxSoFar = Math.max(num, maxSoFar + num);
//             maxTotal = Math.max(maxSoFar, maxTotal);
            
//             minSoFar = Math.min(num, minSoFar + num);
//             minTotal = Math.min(minTotal, minSoFar);
            
//             sum += num;
//         }
//         if(sum == minSoFar) return maxTotal;
//         return Math.max(sum - minTotal, maxTotal);
//     }
    
    // APPROACH 2
     public int maxSubarraySumCircular(int[] A) {
        int nonCircularSum = kadaneMaxSum(A);
        int totalSum = 0;
        for(int i=0;i<A.length;i++){
            totalSum += A[i];
            A[i] = -A[i];
        }
              
        int circularSum = totalSum + kadaneMaxSum(A);
        if(circularSum<=0)
            return nonCircularSum;
        return Math.max(circularSum,nonCircularSum);
    }
    
    int kadaneMaxSum(int[] A){
        int currentSum = A[0];
        int maxSum = A[0];
        for(int i=1;i<A.length;i++){
            if(currentSum < 0)
                currentSum = 0;
            currentSum = A[i] + currentSum;
            maxSum = Math.max(maxSum,currentSum);
        }
        return maxSum;
    }
}