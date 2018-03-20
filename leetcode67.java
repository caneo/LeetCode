/*
两个二进制字符串相加
1）两个字符串的字符相加，再加上前一位上的进位。
2）保存当前位的进位结果，保存当前位的数字，并添加到结果字符串上
3）此时保存的结果字符串需要逆序
*/
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        //int sum=0;
        int carry=0;
        int digit=0;
        while(i>=0 || j>=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i--)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j--)-'0';
            }
            digit=sum%2;
            carry=sum/2;
            res.append(digit);
        }
        if(carry!=0){
            res.append(carry);
        }
        return res.reverse().toString();
    }
}