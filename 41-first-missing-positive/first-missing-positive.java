class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);


        }
        int n = nums.length;
        int cnt=1;
        // for(int i=1;i<=nums.length;i++){
        //     if(!set.contains(i)){
        //         return i;
        //     }
        // }
        while(cnt<=n){
            if(!set.contains(cnt)){
                return cnt;
            }
            cnt++;

        }
        return cnt;
        
    }
}