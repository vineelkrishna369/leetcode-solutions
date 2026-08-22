class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int temp = n;
        
        int prod = 1;
        while(n>0){
            int digit = n%10;
            sum += digit;
            prod *= digit;
            n = n/10;

        }
        int fsum = sum+prod;
        if(temp%fsum==0){
            return true;
        }
        return false;
        
    }
}