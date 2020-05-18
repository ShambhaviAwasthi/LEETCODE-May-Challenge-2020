// Shambhavi Awasthi
// LEETCODE MAY CHALLENGE
// DAY 18: Permutation in String

class Solution {
    
    static int max=256;
    
    static boolean compare(int []arr1,int []arr2){
        for(int i=0;i<256;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true; 
    }
    public boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        if(l1>l2){
            return false;
        }
        int count1[]=new int[max];
        int count2[]=new int[max];
        for(int i=0;i<l1;i++){
            count1[s1.charAt(i)]++;
            count2[s2.charAt(i)]++;
        }
        for(int i=l1;i<l2;i++){
            if(compare(count1,count2)){
                return true;
            }
            count2[s2.charAt(i)]++;
            count2[s2.charAt(i-l1)]--;
        }
        if(compare(count1,count2)){
            return true;
        }
        return false;
    }
}