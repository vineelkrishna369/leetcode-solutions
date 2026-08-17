class Solution {
    public int subarraySum(int[] nums, int k) {
        // int t_sum=0;
        // int count=0;
       
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==k){
        //         count++;
        //     }
        // }
        // for(int i=0;i<nums.length;i++){
        //     t_sum += nums[i];
        //     if(t_sum==k){
        //         count++;
        //         t_sum=0;
        //         i--;
        //     }
        //     if(t_sum>k){
        //         t_sum=0;
            
        //     }
           
            
        // }
        // return count;
        int n = nums.length;
        
        int cnt=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                 if(sum==k){
                cnt++;
                

            }
            
                
            }
           

        }
        return cnt;
        
    }
}