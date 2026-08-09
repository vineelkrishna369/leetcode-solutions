class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n = nums.length;
         int middle = n/2;
         int cnt=0;
         int val = nums[middle];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
           
           
        }
        if(map.get(nums[middle])>1){
            return false;
        }
        return true;
        
    }
}