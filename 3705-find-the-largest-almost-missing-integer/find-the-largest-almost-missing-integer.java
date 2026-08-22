class Solution {
    public int largestInteger(int[] nums, int k) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        

        // int n = nums.length;
        // for(int i=0;i<=n-k;i++){
        //     for(int j=i;j<i+k;j++){
        //         if(!map.containsKey(nums[j])){
        //             map.put(nums[j],1);
        //         }
        //         else{
        //             map.put(nums[j],map.get(nums[j])+1);
        //         }

        //     }
        // }
        // int max = -1;
        // for(int a : map.keySet()){
        //     if(map.get(a)==1){
        //         max = Math.max(max,a);
        //     }
        // }
        // return max;
        
        HashMap<Integer, Integer> map = new HashMap<>();

        int n = nums.length;

        for (int i = 0; i <= n - k; i++) {

            HashSet<Integer> set = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // Each number counted only once for this window
            for (int x : set) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }
        }

        int max = -1;

        for (int x : map.keySet()) {
            if (map.get(x) == 1) {
                max = Math.max(max, x);
            }
        }

        return max;
    }
}

 