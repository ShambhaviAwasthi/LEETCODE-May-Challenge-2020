// SHAMBHAVI AWASTHI
// LEETCODE MAY CHALLENGE
// DAY 12 : Single Element in a Sorted Array


class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=nums.length;
        int count=0;
        if(l==1){
            return nums[0];
        }
        int val=0;
        for(int i=0;i<l-1;i++){
            if(nums[i]==nums[i+1]){
                count++;
            }
            else if(nums[i] != nums[i+1] && count==0){
                val=nums[i];
                break;
            }
            else
                count=0;
        }
        if(nums[l-1]!=nums[l-2])
            return nums[l-1];
        else
            return val;
        
    }
}