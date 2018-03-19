public class Solution {
    public int lengthOfLongestSubstring(String s) {
    	int len=s.length();
    	HashMap<Character, Integer> map=new HashMap<>();
    	int index=0;
    	int max=0;
    	for(int i=0;i<len;i++){
    		if(map.containsKey(s.charAt(i))){
    			index=Math.max(map.get(s.charAt(i)), index);
    		}
    		max=Math.max(max, i-index+1);
    		map.put(s.charAt(i),i+1);
    	}
		return max;
    		
    }
}