class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<n;i++){
            set.add(nums[i]);

        }
        for(int i=1;i<=n;i++){
            int a = k*i;
            if(!set.contains(a)){
                return a;
            }

        }
        return k*(n+1);
        
    }
}