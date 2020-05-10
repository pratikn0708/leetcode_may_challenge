class Solution {
    public int findJudge(int N, int[][] trust) {
        int judge=-1;
        int arr[]=new int[N+1];
        for(int i=0;i<trust.length;i++){
            arr[trust[i][1]]++;
        }

        // For satisfying Condition 1 
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==N-1){
                judge=i;
            }
        }
        
        // For satisfying Condition 1
        for (int i=0;i<trust.length;i++){
            if(judge==trust[i][0]){
                judge=-1;
                break;
            }
        }
        
        return judge;
    }
}