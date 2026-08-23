class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int f_min = Integer.MAX_VALUE;
        int n = nums.length;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         sum += nums[j];
        //         if(sum>=target){
        //             int min = j-i+1;
        //             f_min = Math.min(min,f_min);
        //         }
                

        //     }
        // }
        // if(f_min==Integer.MAX_VALUE){
        //     return 0;
        // }
        // return f_min;
        int left = 0;
        int sum=0;
        int min = Integer.MAX_VALUE;
        for(int right=0;right<n;right++){
            sum += nums[right];
            while(sum>=target){
                min = Math.min(min,right-left+1);
                sum -= nums[left];
                left++;
            }

        }
        if(min!=Integer.MAX_VALUE){
            return min;
        }
        return 0;

    }
}