class Solution {
    public int[] productExceptSelf(int[] nums) {
        int cnt=0;
        int prod= 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                cnt++;

            }

        }
        if(cnt>1){
            for(int i=0;i<nums.length;i++){
                nums[i]=0;
            }
            return nums;
        }
        else if(cnt==1){
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    prod *= nums[i];

                }
            }
            for(int i=0;i<nums.length;i++){
                if(nums[i]!=0){
                    nums[i]=0;
                }
                else{
                    nums[i]=prod;
                }
            }
            return nums;
        }
        else{
            
                for(int i=0;i<nums.length;i++){
                    prod *= nums[i];
                }
                for(int i=0;i<nums.length;i++){
                    nums[i]= prod/nums[i];
                }
                
            
        }
        return nums;
        
        
   
    }
}