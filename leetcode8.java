class Solution {
    public int myAtoi(String str) {
    int len=str.length();
    int i=0;
    int sign=1;
    int result=0;
    if(len<1){
        return 0;
    }
    while(str.charAt(i)==' ' && i<len)
    {
      i++;  
    }
    if(str.charAt(i)=='+' ||str.charAt(i)=='-'){
        sign=str.charAt(i)=='-'? -1:1;
        i++;
    }
    while(i<len){
        int digit=str.charAt(i)-'0';
        if(digit<0||digit>9){
            break;
        }
        if(Integer.MAX_VALUE/10<result ||(Integer.MAX_VALUE/10==result && Integer.MAX_VALUE %10 <digit)){
            return sign==1? Integer.MAX_VALUE :Integer.MIN_VALUE;
        }
        result=result*10+digit;
        i++;
    }
    return result*sign;
}
}

