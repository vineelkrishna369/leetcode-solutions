class Solution {
    public boolean isPalindrome(String s) {
        String str="";
        int n = s.length();

        for(int i=0;i<n;i++){
             int v = (int)s.charAt(i);
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                str += (char)(v+32);
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                str += s.charAt(i);
            }
            else if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                str += s.charAt(i);
            }
             
        }
        int l = str.length();
        int cnt=0;
        for(int i=0;i<str.length();i++){
           
            if(str.charAt(i)==str.charAt(l-i-1)){
                cnt++;

            }
            
        }
        if(cnt==l || l==0){
            return true;
        }
        return false;

    
}
}