class Solution {
    public int firstUniqChar(String s) {

	// FIRST APPROACH 
//         int arr[]=new int[26];
//         for(int i=0;i<s.length();i++)
//             arr[s.charAt(i)- 'a']++;
        
//         int index=-1;
//         for(int i=0;i<s.length();i++){
//             if(arr[s.charAt(i)- 'a']==1){
//                 index=i;
//                 break;
//             }
//         }
//         return index;
        
	// SECOND APPROACH
        int index=Integer.MAX_VALUE;
        for(char c = 'a'; c <= 'z'; c ++ ){
            int left = s.indexOf(c);          
            if(left != -1 && left == s.lastIndexOf(c)) {
                index = Math.min(left, index);
            }
        }
        return index==Integer.MAX_VALUE?-1:index;
    }
}