// class Solution {
//     public int[] topKFrequent(int[] nums, int k) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         int[] result = new int[k];
        
//         for(int i=0;i<nums.length;i++){
//             if(!map.containsKey(nums[i])){
//                 map.put(nums[i],1);
//             }
//             else{
//                 map.put(nums[i],map.get(nums[i])+1);
//             }

            

//         }
//         for(int n : keySet()){

//             if(map.get(n))
//         }
        
//     }
// }
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        int[] result = new int[k];

        // find the k highest frequencies
        for (int i = 0; i < k; i++) {
            int max = 0;
            int maxKey = 0;

            for (int key : map.keySet()) {
                if (map.get(key) > max) {
                    max = map.get(key);
                    maxKey = key;
                }
            }

            result[i] = maxKey;
            map.remove(maxKey);
        }

        return result;
    }
}