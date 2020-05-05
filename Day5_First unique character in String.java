// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE 2020
// Day 5: First Unique Character in a String
// Java Solution O(n), 7ms


class Solution {
    public int firstUniqChar(String s) {
        int count[]=new int[256];
        for(int i=0;i<s.length();i++){
            count[(int)s.charAt(i)]++;   
        }
        for(int j=0;j<s.length();j++){
            if(count[(int)s.charAt(j)]==1){
                return j;
            }
        }
        return -1;
    }
}
