class Solution {
    public int singleNonDuplicate(int[] nums) {
        int nonRepitionNo=-1;
        if(nums.length==1){
            nonRepitionNo=nums[0];
        }
        for(int i=0;i<nums.length-2;i+=2){
            if(nums[i]!=nums[i+1]){
                nonRepitionNo=nums[i];
                break;
            }
        }
        return nonRepitionNo==-1?nums[nums.length-1]:nonRepitionNo;
    }
}