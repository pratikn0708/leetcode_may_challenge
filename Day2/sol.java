class Solution {
    public int numJewelsInStones(String J, String S) {
        int jewels=0;
        int arr[]=new int[58];
        for(int i=0;i<J.length();i++){
            arr[J.charAt(i)-65]++;
        }
        
        for(int i=0;i<S.length();i++){
            if(arr[S.charAt(i)-65]==1)
                jewels++;
        }
        
        return jewels;
    }
}