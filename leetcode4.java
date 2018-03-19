import java.util.ArrayList;
import java.util.List;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int i=0,j=0;
        double median=0.0;
        List<Integer> nums3=new ArrayList<Integer>();
        while(i<len1&&j<len2){
            if (nums1[i]>nums2[j]){
                nums3.add(nums2[j++]);
                //j++;
            }
            else{
                nums3.add(nums1[i++]);
                //i++;
            }     
        }
        while(j<len2){
            nums3.add(nums2[j++]);
        }
        while(i<len1){
            nums3.add(nums1[i++]);
        }
        int k=nums3.size();
        if(k%2==0){
            median=1.0*((nums3.get(k/2-1))+nums3.get(k/2))/2;
        }
        else{
            median=1.0*nums3.get((k-1)/2);
        }
        return median;
        
    }
}
