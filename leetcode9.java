class Solution {
    public boolean isPalindrome(int x) {
        if (x<0 || (x!=0 && x%10==0)){return false;}
        int divisor=0;
        while(x>divisor){  
            divisor=divisor*10+x%10;
            x=x/10;
        }
        return (x==divisor||x==divisor/10);
            
    }
}