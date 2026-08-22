class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int prod  = 1;
        int max_prod = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                prod *= nums[j];
                max_prod = Math.max(max_prod,prod);
                

            }
            prod = 1;
            
        }
        return max_prod;
       
        
    }
}