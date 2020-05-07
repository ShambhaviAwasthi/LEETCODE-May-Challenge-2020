// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 6: Majority Element

class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length)/2];
    }
}
