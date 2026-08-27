class Solution {
    public int maxProduct(int[] nums) {
        // int n = nums.length;
        // int prod  = 1;
        // int max_prod = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     for(int j=i;j<n;j++){
        //         prod *= nums[j];
        //         max_prod = Math.max(max_prod,prod);
                

        //     }
        //     prod = 1;
            
        // }
        // return max_prod;
      
        int max_p = nums[0];
        int min_p = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            int oldMax = max_p;
            int oldMin = min_p;

            max_p = Math.max(num, Math.max(num * oldMax, num * oldMin));
            min_p = Math.min(num, Math.min(num * oldMax, num * oldMin));

            ans = Math.max(ans, max_p);
        }

        return ans;
    }
}
        
 