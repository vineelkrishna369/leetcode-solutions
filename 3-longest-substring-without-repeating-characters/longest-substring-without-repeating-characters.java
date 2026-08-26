class Solution {
    public int lengthOfLongestSubstring(String s) {
//         int l = s.length();
//         int maxlen=0;
//         int left=0;

        HashSet<Character> set = new HashSet<>();
        // for(int right=0;right<l;right++){
        //     while(set.contains(s.charAt(right))){
        //         set.remove(s.charAt(left));
        //         left++;
        //     }
        //     set.add(s.charAt(right));
        //     maxlen = Math.max(maxlen,right-left+1);
        // }
        // return maxlen;
        int n = s.length();
        int left=0;
        int right=0;
        int count=0;

        int max_c = 0;
        while(right<n){
            if(!set.contains(s.charAt(right))){
                set.add(s.charAt(right));
                right++;
                count = right-left;
                

            }
            else{
                
                set.remove(s.charAt(left));
                left++;
            }
            max_c = Math.max(max_c,count);

        }
        return max_c;

        

    }
}