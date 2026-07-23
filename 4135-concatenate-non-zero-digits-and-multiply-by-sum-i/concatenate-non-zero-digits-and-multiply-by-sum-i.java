class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long sum = 0;
        long len= 1;
        while(n!=0){
            int digit = n%10;
            
            sum += digit;
            x = x + digit*len;
            if(digit!=0) len = len*10;
            
            n=n/10;
        }
        return x*sum;
    }
}