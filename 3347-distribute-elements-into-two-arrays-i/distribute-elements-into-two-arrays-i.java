class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        list1.add(0,nums[0]);
        list2.add(0,nums[1]);
      
        for(int i=2;i<n;i++){
            if(list1.get(list1.size()-1)>list2.get(list2.size()-1)){
                list1.add(nums[i]);
            }
            else{
                list2.add(nums[i]);
            }
        }
        int n1 = list1.size();
        int n2 = list2.size();
        for(int i=0;i<n1;i++){
            nums[i]=list1.get(i);
        }
        for(int i=0;i<n2;i++){
            nums[n1+i]=list2.get(i);
        }
        return nums;

        
    }
}