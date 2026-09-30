class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int k=0;
        int cnt=-1;
        int[] arr = new int[n1];
        for(int i=0;i<n1;i++){
            arr[i]=-1;
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    k=j;

                }
            }
            for(int j=k+1;j<n2;j++){
                if(nums2[j]>nums1[i]){
                    arr[i]=nums2[j];
                    cnt=j;
                    break;
                    
                }
                
               
            }
            
            
        }
      
        return arr;
    }
}