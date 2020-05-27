// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 26 : CONTIGUOUS ARRAY

public class Solution {

    public int findMaxLength(int[] nums) {
        // creating hash map 
        Map<Integer, Integer> map = new HashMap<>();
        // fill map with 0
        map.put(0, -1);
        // initialize maxlen and count
        int maxlen = 0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            // count =count+1 if arr[i]==1, count=count-1 if arr[i]=0
            count = count + (nums[i] == 1 ? 1 : -1);
            // storing count value in map with respective i value as length
            if (map.containsKey(count)) {
                // if map already has count key
                // replace maxlen with maximum of maxlen or the i value of current count
                maxlen = Math.max(maxlen, i - map.get(count));
            } else { // else put the new key in map
                map.put(count, i);
            }
        }
        return maxlen;
    }
}
