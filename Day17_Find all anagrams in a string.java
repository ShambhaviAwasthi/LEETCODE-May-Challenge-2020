// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 17: FIND ALL ANAGRAMS IN A STRING

class Solution {
    
    static final int max=256;
    
    static boolean comparison(int arr1[], int arr2[]){ // comparison function to compare two count array
        for(int i=0;i<max;i++){
            if(arr1[i]!=arr2[i])
                return false;
        }
        return true;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        
        int n=s.length(); // length of text
        int m=p.length(); // length of pattern
        
        int countS[]=new int[max];  // to store frequencies of text characters in current window pf m
        int countP[]=new int[max];  // to store frequencies of pattern characters 
        
        ArrayList<Integer> al=new ArrayList<Integer>(); // to store indices of match
        
        if(n<m){ // length of text is less than length of pattern
            return al;
        }
        
        for(int i=0;i<m;i++){
            countS[s.charAt(i)]++; // storing frequency in m window
            countP[p.charAt(i)]++;
        }
        
        for(int i=m;i<n;i++){
            if(comparison(countS,countP)){
                al.add(i-m);
            }
            countS[s.charAt(i)]++;  // including frequency of new character
            countS[s.charAt(i-m)]--; // reducing frequency of previous character
        }
        if(comparison(countS,countP)){ // to check the last window
            al.add(n-m);
        }
        return al;
    }
}