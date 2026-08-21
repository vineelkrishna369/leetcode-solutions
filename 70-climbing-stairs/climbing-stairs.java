class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        
        // if(n<=2){
        //     return n;
        // }
        // dp[0]=0;
        // if(n>=1){
        //     dp[1]=1;
        // }
        // if(n>=2){
        //     dp[2]=2;
        // }
       
        // for(int i=3;i<n+1;i++){
            
        //     dp[i]=dp[i-1]+dp[i-2];

        // }
        // return dp[n];
        if(n<=2){
            return n;
        }
        int prev2 = 1;
        int prev = 2;
        int curr=0;

        for(int i = 3;i<n+1;i++){
             curr = prev2 +prev ;
            prev2 = prev;
            prev = curr;
        }
        return curr;


        

       
        
       
    

    
       
    }
}