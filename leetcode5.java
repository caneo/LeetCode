class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String res=null;
        boolean[][] dp=new boolean[n][n];
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                /*j-i<3表示的是类似aba这种字符串
                * dp[i][j] = dp[i+1][j-1] && s[i]==s[j]
                */
                dp[i][j]=(s.charAt(i)==s.charAt(j))&&(j-i<3 || dp[i+1][j-1]);
                /*更新最长回文串
                * 如果dp[i][j]=true则表示字符串S中i-j部分为回文串； 并且当前的超过了历史最长回文串则进行更新（j - i + 1 > res.length()）
                * res=null，处理的是第一次得到回文串的时候。
                */
                if((dp[i][j])&& (res==null ||(j - i + 1 > res.length()))){
                    res=s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}