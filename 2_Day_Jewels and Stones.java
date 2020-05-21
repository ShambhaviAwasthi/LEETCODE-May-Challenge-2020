// Shambhavi Awasthi
// Leet Code May Challenge
// Ques 2: Jewels and Stones
// Runtime : 0 ms


class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        for(int i=0;i<J.length();i++){
            char ch=J.charAt(i);
            for(int j=0;j<S.length();j++){
                if(ch==S.charAt(j)){
                    count++;
                }
            }
        }
        return count;
        
    }
}
