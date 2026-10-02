class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        int max = nums[n-1];
        int count =0;
       for(int i=n-2;i>=0;i--){
        if(nums[i]!=max){
            count++;
            max = nums[i];
        }
        if(count==2){
            return nums[i];
        }
       }
       return nums[n-1];
    // if(n<3){
    //     return nums[n-1];
    // }
    // return nums[n-3];

       
    }
}