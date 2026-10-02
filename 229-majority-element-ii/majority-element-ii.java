class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int l=n/3;
        
        // for(int i=0;i<nums.length;i++){
        //     int count=0;
        //     for(int j=i;j<nums.length;j++){
        //         if(nums[i]==nums[j]){
        //             count++;

        //         }
                
        //     }
        //     if(count>l && !list.contains(nums[i])){
        //         list.add(nums[i]);
        //     }


        // }
        // return list;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        for(int k: map.keySet()){
            if(map.get(k)>l){
                list.add(k);
                
            }
        }
        return list;
        
        
    }
}