// Shambhavi Awasthi
// LEETCODE : May Challenge 2020
// Day 3: Ransome Note
// Java Solution


class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[256]; 
        char []str3 = magazine.toCharArray(); 
        for (int i = 0; i < str3.length; i++) 
            count[str3[i]]++; 
        char []str4 = ransomNote.toCharArray(); 
        for (int i = 0; i < str4.length; i++) { 
            if (count[str4[i]] == 0) 
                return false; 
            count[str4[i]]--; 
        } 
        return true; 
    }
}
