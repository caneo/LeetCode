class Solution {
    public int reverse(int x) {
        int divisor=x;
        int result=0;
        while(divisor!=0){ 
            int temp=divisor%10;
            divisor=divisor/10;
            if(((result*10+temp)-temp)/10!=result){
            	return 0;
            }
            result=result*10+temp;
        }
        return result;
    }
}