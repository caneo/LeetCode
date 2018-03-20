/*两个数相乘,通过观察两个数相乘的特点。
1）从低位到高位，两个数的位数依次相乘；其结果最多位数为数1长度+数2长度（有进位）
2）数1第i位的数字和数2第j位的数字相乘，其结果是存储在i+j位上的。
3）对于每一位上的结果，求得其进位和该位上的实际数字。
4）去除前导0
*/
class Solution {
    public String multiply(String num1, String num2) {
        int len1=num1.length();
        int len2=num2.length();
        int[] temp=new int[len1+len2]; 
        //将num1，num2倒序
        String n1 = new StringBuilder(num1).reverse().toString();  
        String n2 = new StringBuilder(num2).reverse().toString();  
        //保存num1第i位的数字和num2第j位数字相乘的结果
        for(int i=0; i<len1; i++){
            for(int j=0; j<len2; j++){
                temp[i+j]=temp[i+j]+(n1.charAt(i)-'0')*(n2.charAt(j)-'0');
            }
        }
        StringBuilder sb=new StringBuilder();
        
        int carry=0;
        int digit=0;
		
        for(int i=0; i<temp.length; i++){
            temp[i]+=carry;//前一位上的进位
            carry=temp[i]/10;//当前位上产生的进位
            digit=temp[i]%10;//当前位的数字
            sb.insert(0, digit);//将最高位插到最前面，使得得到的字符串从高位到低位的
        }
        
        while(sb.charAt(0)=='0' && sb.length()>1){//去除前导0
             sb.deleteCharAt(0); 
        }
        return sb.toString();
    }
}