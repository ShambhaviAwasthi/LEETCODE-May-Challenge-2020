// Shambhavi Awasthi
// LEETCODE : May Challenge 2020
// Day 3: Ransome Note
// Java Solution


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[256]; 
        char []str1 = magazine.toCharArray(); 
        for (int i = 0; i < str1.length; i++) 
            count[str1[i]]++; 
        char []str2 = ransomNote.toCharArray(); 
        for (int i = 0; i < str2.length; i++) { 
            if (count[str2[i]] == 0) 
                return false; 
            count[str2[i]]--; 
        } 
        return true; 
    }
}
