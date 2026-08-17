class Solution {
    public int pivotIndex(int[] nums) {
        // int n = nums.length;
        // int total_sum=0;
        // int left_sum = 0;
        // for(int i=0;i<n;i++){
        //     total_sum = nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     int right_sum = total_sum-left_sum-nums[i];
        //     if(right_sum==left_sum){
        //         return i;
        //     }
        //     left_sum += nums[i];
        // }
        // return -1;
       

        int totalSum = 0;

        // Calculate total sum
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Find pivot index
        for (int i = 0; i < nums.length; i++) {

            int rightSum = totalSum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}

        
        


       
 