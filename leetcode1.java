public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map= new HashMap<Integer,Integer>();  //索引号作为key，对应数组的值作为value
        int[] result=new int[2];
        if (nums.length==0||nums.length<2){//空数组和少于两个元素的数组
            return null;
        }
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i])){ //和为target的两个元素
                result[1]=i;
                result[0]=map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i],i); //遍历数组以key-value存储
        }
        return null;
    }
}