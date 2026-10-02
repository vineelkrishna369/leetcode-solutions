class Solution {
    public int thirdMax(int[] nums) {
        // Arrays.sort(nums);
        
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        
    //     int max = nums[n-1];
    //     int count =0;
    //    for(int i=n-2;i>=0;i--){
    //     if(nums[i]!=max){
    //         count++;
    //         max = nums[i];
    //     }
    //     if(count==2){
    //         return nums[i];
    //     }
    //    }
    //    return nums[n-1];
    // if(n<3){
    //     return nums[n-1];
    // }
    // return nums[n-3];
    for(int i=0;i<n;i++){
        set.add(nums[i]);


    }
    ArrayList<Integer> list = new ArrayList<>(set);
    Collections.sort(list);
    if(list.size()<3){
        return list.get(list.size()-1);
    }
    return list.get(list.size()-3);

    

       
    }
}