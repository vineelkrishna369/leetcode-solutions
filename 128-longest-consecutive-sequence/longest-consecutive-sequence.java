class Solution {
    public int longestConsecutive(int[] nums) {
        // Arrays.sort(nums);
    //     ArrayList<Integer> list = new ArrayList<>();
    //     int count =1;
    //     int mcount =1;

    //     for(int i=0;i<nums.length;i++){
    //         if (i == 0 || nums[i] != nums[i - 1]) {
    //     list.add(nums[i]);
    // }
    //     }
    //     for(int i=0;i+1<list.size();i++){
    //         if(list.get(i+1)==list.get(i)+1){
    //             count++;
    //              mcount = Math.max(count,mcount);
            
    //         }
    //         else{
    //             count=1;
               
    //         }
           
    //     }
    //     if(nums.length==0){
    //         return 0;
    //     }
    //     return mcount;
    
    int cnt=1;
    int m_cnt = 1;
    HashSet<Integer> set = new HashSet<>();
    int n = nums.length;
    if(n==0){
        return 0;
    }
    
    for(int i=0;i<n;i++){
        if(!set.contains(nums[i])){
            set.add(nums[i]);
        }
    }
     ArrayList<Integer> list = new ArrayList<>(set);
     Collections.sort(list);
     for(int i=0;i+1<list.size();i++){
        if(list.get(i)+1==list.get(i+1)){
            cnt++;
            m_cnt = Math.max(cnt,m_cnt);
        }
        else{
            cnt=1;
        }

     }
     return m_cnt;
   
        
    }
}