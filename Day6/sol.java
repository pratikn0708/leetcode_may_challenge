class Solution {
    public int majorityElement(int[] nums) {

	// FIRST APPROACH
//         int majorityNum=-1;
        
//         if(nums.length==1)
//             majorityNum=nums[0];
//         else {
//             Arrays.sort(nums);
//             int temp=nums[0];
//             int count=1;
//             for(int i=1;i<nums.length;i++){
//                 if(temp==nums[i]){
//                     count++;
//                     if(count > (nums.length/2)){
//                         majorityNum=nums[i];
//                         break;
//                     }
//                 }else{
//                     temp=nums[i];
//                     count=1;
//                 }
//             }
//         }
//         return majorityNum;
        
	// SECOND APPROACH
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
}